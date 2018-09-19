package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpsConnectionUtil {
    private static final Log logger = LogFactory.getLog(HttpsConnectionUtil.class);

    public static String postSOAP(String url, String soapContent)
    {
        HttpClient httpclient = null;
        HttpPost httpPost = null;
        BufferedReader reader = null;
        int i = 0;
        while (i < 4)
        {
            try
            {
                httpclient = new DefaultHttpClient();
                X509TrustManager tm = new X509TrustManager()
                {
                    public void checkClientTrusted(X509Certificate[] xcs, String string)
                            throws CertificateException
                    {}

                    public void checkServerTrusted(X509Certificate[] xcs, String string)
                            throws CertificateException
                    {}

                    public X509Certificate[] getAcceptedIssuers()
                    {
                        return null;
                    }
                };
                SSLContext ctx = SSLContext.getInstance("TLS");
                ctx.init(null, new TrustManager[] { tm }, null);
                SSLSocketFactory ssf = new SSLSocketFactory(ctx);

                ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                ClientConnectionManager ccm = httpclient.getConnectionManager();
                SchemeRegistry sr = ccm.getSchemeRegistry();
                sr.register(new Scheme("https", ssf, 443));
                httpclient = new DefaultHttpClient(ccm, httpclient.getParams());
                httpPost = new HttpPost(url);
                StringEntity myEntity = new StringEntity(soapContent, "GB2312");
                httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=gb2312");
                httpPost.setEntity(myEntity);
                HttpResponse response = httpclient.execute(httpPost);
                logger.info("response==>"+response.toString());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null)
                {
                    reader = new BufferedReader(new InputStreamReader(resEntity
                            .getContent(), "GB2312"));
                    StringBuffer sb = new StringBuffer();
                    String line = null;
                    while ((line = reader.readLine()) != null)
                    {
                        sb.append(line);
                        sb.append("\r\n");
                    }
                    return sb.toString();
                }
            } catch (Exception e) {
                i++;
                if (i == 4) {
                    logger.error("not connect:" + url + "\n" + e.getMessage());
                }
            }
            finally
            {
                if (httpPost != null) {
                    httpPost.abort();
                }
                if (reader != null) {
                    try
                    {
                        reader.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (httpclient != null) {
                    httpclient.getConnectionManager().shutdown();
                }
            }
            if (httpPost != null) {
                httpPost.abort();
            }
            if (reader != null) {
                try
                {
                    reader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (httpclient != null) {
                httpclient.getConnectionManager().shutdown();
            }
        }
        return "none";
    }
}
