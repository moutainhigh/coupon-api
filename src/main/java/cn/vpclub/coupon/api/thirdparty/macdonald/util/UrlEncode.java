package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncode {
    public static String encode(String str, String code)
    {
        String encoder = null;
        try
        {
            encoder = URLEncoder.encode(str, code);
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return encoder;
    }

    public static String encode(String str)
    {
        String encoder = null;
        try
        {
            encoder = URLEncoder.encode(str, "utf8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return encoder;
    }

    public static String decode(String encode)
    {
        String decode = null;
        try
        {
            decode = URLDecoder.decode(encode, "utf8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return decode;
    }

    public static String decode(String xml, String code)
    {
        String keyWord = null;
        try
        {
            keyWord = URLDecoder.decode(xml, code);
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return keyWord;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "3244fdsf飞倒萨方式";
        System.out.println(encode(str));
        System.out.println(decode(str));
    }
}
