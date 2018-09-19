package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class XML {
    public static String toXML(Object obj)
    {
        XStream xstream = new XStream(new XppDriver(new XmlFriendlyReplacer("_-", "_")));
        xstream.alias(obj.getClass().getSimpleName(), obj.getClass());
        String xml = xstream.toXML(obj);
        return xml;
    }

    public static Object fromXML(String xml, Object obj)
    {
        XStream xs = new XStream(new DomDriver());
        xs.alias(obj.getClass().getSimpleName(), obj.getClass());
        Object ob = xs.fromXML(xml);
        return ob;
    }

    public static String XMLVersion(Object obj)
    {
        StringBuffer xml = new StringBuffer("<?xml version=\"1.0\" encoding=\"GBK\" ?>\r\n");
        xml.append(toXML(obj));
        return xml.toString();
    }

    public static String toXML(List<?> list)
    {
        if (list.size() > 0)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(toXML(list.get(i)) + "\n");
            }
            return sb.toString();
        }
        return "";
    }

    public static String toXML(List<?> list, String lableName)
    {
        lableName = lableName.substring(0, 1).toUpperCase() + lableName.substring(1);
        StringBuilder sb = new StringBuilder();
        sb.append("<" + lableName + ">\n");
        sb.append(toXML(list));
        sb.append("</" + lableName + ">\n");
        return sb.toString();
    }

    public static String URLEncodeXML(String xml, String password) throws UnsupportedEncodingException {
        String passwordxml = password + xml + password;
        String urlencodexml = UrlEncode.encode(xml);
        String md5xml = Md5.Encode(passwordxml);
        xml = "xml=" + urlencodexml + "&mac=" + md5xml;
        return xml;
    }

    public static String GenerateXML(Object model)
    {
        XStream xStream = new XStream(new XppDriver(new XmlFriendlyReplacer("_-", "_")));
        xStream.alias(model.getClass().getSimpleName(), model.getClass());
        String xml = xStream.toXML(model);
        xml = "<?xml version=\"1.0\" encoding=\"GBK\" ?>\r\n" + xml;
        return xml;
    }

    public static String responseXML(String xml, String password, String url, HttpsConnectionUtil client)
            throws UnsupportedEncodingException
    {
        String s = URLEncodeXML(xml, password);
        String ss = HttpsConnectionUtil.postSOAP(url, s);
        String[] array = ss.split("\\&");
        String sss = UrlEncode.decode(array[0], "GB2312");
        return sss;
    }

    public static String addNodeAttribute(String soap, String node, String attributeName, String attributeValue)
    {
        Document document = null;
        try
        {
            document = DocumentHelper.parseText(soap);
            Element e = (Element)document.selectSingleNode("/" + node);
            e.addAttribute(attributeName, attributeValue);
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
        return document.asXML();
    }

}
