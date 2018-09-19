package cn.vpclub.coupon.api.utils.ek;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StreamUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;


public class ErkuaiModUtil {

    private final static Logger log = LoggerFactory.getLogger(ErkuaiModUtil.class);

    public static String weizhangBaseUrl = "http://10.209.176.50:8091/ekmod";                             //违章查询调用路径
    //	public static String yaxinBaseUrl = "http://10.209.176.63:8080/ekmod";                                //亚信查询调用路径
    //	public static String yaxinBaseUrl = "http://localhost:8080/ekmod";                                //亚信查询调用路径
    //  亚信查询调用路径
    public static String yaxinBaseUrl = "http://192.168.25.88:8080";                     //亚信查询调用路径
    public static String msgSendBaseUrl = "http://10.209.176.63:8080/ekmod";                              //10086短信发送路径
    //	public static String msgSendBaseUrl = "http://localhost:8080/ekmod";                              //10086短信发送路径

    /**
     * 请求ErkuaiMod服务端的客户端方法
     *
     * @param ekUrl   请求的地址URL
     * @param reqBody 请求参数
     * @return
     */
    public static String request(String ekUrl, Map<String, String> reqBody) {
        HttpURLConnection connection = null;
        String resp = "";
        try {
            URL reqUrl = new URL(ekUrl);
            connection = (HttpURLConnection) reqUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(11000);
            connection.setReadTimeout(11000);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");

            if (connection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsConnection = (HttpsURLConnection) connection;
                addSSLSocketFactory(httpsConnection);
            }

            if (reqBody != null && reqBody.size() > 0) {
                ObjectMapper om = new ObjectMapper();
                StreamUtils.copy(om.writeValueAsString(reqBody), Charset.forName("utf-8"), connection.getOutputStream());
            }

            if (connection.getResponseCode() != 200) {
                throw new Exception("ErkuaiModClient HTTP Code Error:" + connection.getResponseCode());
            }
            resp = StreamUtils.copyToString(connection.getInputStream(), Charset.forName("utf-8"));
            log.info("ErkuaiModClient Result ekUrl:" + ekUrl + " reqBody:" + reqBody + " resp:" + resp);
        } catch (Exception e) {
            log.error("ErkuaiModClient Exception ekUrl:" + ekUrl + " reqBody:" + reqBody + " resp:" + resp, e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return resp;
    }

    /**
     * 为Https连接添加SSLSocketFactory
     *
     * @param httpsConnection HTTPS连接
     * @throws Exception
     */
    private static void addSSLSocketFactory(HttpsURLConnection httpsConnection) throws Exception {
        SSLContext ssl = SSLContext.getInstance("SSL");
        X509TrustManager myX509TrustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] arg0,
                                           String arg1) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] arg0,
                                           String arg1) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[]{};
            }
        };
        ssl.init(null, new TrustManager[]{myX509TrustManager}, null);
        httpsConnection.setSSLSocketFactory(ssl.getSocketFactory());
    }
}
