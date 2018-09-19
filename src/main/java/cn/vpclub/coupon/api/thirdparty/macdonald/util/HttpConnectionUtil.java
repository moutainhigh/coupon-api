package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpConnectionUtil {
    private static final Log logger = LogFactory.getLog(HttpConnectionUtil.class);

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
                httpclient =new DefaultHttpClient();
                httpPost = new HttpPost(url);
                StringEntity myEntity = new StringEntity(soapContent, "GB2312");
                httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=gb2312");
                httpPost.setEntity(myEntity);
                HttpResponse response = httpclient.execute(httpPost);
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
            }
            catch (Exception e)
            {
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
