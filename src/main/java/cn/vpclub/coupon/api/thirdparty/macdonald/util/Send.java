package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Send {
    private static final String CONTENT_CHARSET = "GBK";

    public static String MergeXML(Object obj, String systemIdMac)
    {
        String xml = XML.XMLVersion(obj);
        System.out.println(xml);

        StringBuffer postSoap = null;
        String urlEncode = "xml=" + UrlEncode.encode(xml.toString(), "GB2312");
        String mac = "&mac=" + Md5.Encode(new StringBuilder(String.valueOf(systemIdMac)).append(xml.toString()).append(systemIdMac).toString(), "GB2312");
        postSoap = new StringBuffer(urlEncode);
        postSoap.append(mac);
        log.info("发送前的数据:"+postSoap.toString());
        return postSoap.toString();
    }

    public static String MergeXML(Object obj)
    {
        System.out.println(XML.XMLVersion(obj));
        return XML.XMLVersion(obj);
    }

    public static String doPost(String url, Object obj)
    {
        HttpConnectionUtil client = new HttpConnectionUtil();

        String soapContent = MergeXML(obj);

        String postSOAP = HttpConnectionUtil.postSOAP(url, soapContent);
        System.out.println(postSOAP);
        return postSOAP;
    }

    public static String doPosts(String url, String systemIdMac, Object obj)
    {
        HttpsConnectionUtil client = new HttpsConnectionUtil();
        String soapContent = MergeXML(obj, systemIdMac);
        //正式环境发送请求需要校验ssl证书
        String postSOAP = HttpsConnectionUtil.postSOAP(url, soapContent);
        log.info("返回得到的数据 :"+postSOAP.toString());
        int endIndex= postSOAP.lastIndexOf("&mac");
        log.info("endIndex:"+endIndex);
        postSOAP = postSOAP.substring(4, postSOAP.lastIndexOf("&mac="));
        postSOAP = UrlEncode.decode(postSOAP, "gb2312");
        log.info("postSOAPResponse:"+postSOAP.toString());
        return postSOAP;
    }
    public static String Posts(String url, String systemIdMac, Object obj) throws Exception {
        String soapContent = MergeXML(obj, systemIdMac);
        //测试环境不校验证书
        String postResponse=HttpsUtil.post(url, soapContent);
        log.info("返回得到的数据 :"+postResponse.toString());
        int endIndex= postResponse.lastIndexOf("&mac");
        log.info("endIndex:"+endIndex);
        postResponse = postResponse.substring(4, postResponse.lastIndexOf("&mac="));
        postResponse = UrlEncode.decode(postResponse, "gb2312");
        log.info("postResponse:"+postResponse.toString());
        return postResponse;
    }
}
