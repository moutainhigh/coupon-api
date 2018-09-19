package cn.vpclub.coupon.api.thirdparty.macdonald.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class Md5 {
    public static String Encode1(String inStr)
    {
        MessageDigest md5 = null;
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = ((byte)charArray[i]);
        }
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++)
        {
            int val = md5Bytes[i] & 0xFF;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static String KL(String inStr)
    {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = ((char)(a[i] ^ 0x74));
        }
        String s = new String(a);
        return s;
    }

    public static String JM(String inStr)
    {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = ((char)(a[i] ^ 0x74));
        }
        String k = new String(a);
        return k;
    }

    public static String Encode(String inStr)
    {
        MessageDigest md5 = null;
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        byte[] byteArray = (byte[])null;
        try
        {
            byteArray = inStr.getBytes("utf8");
        }
        catch (UnsupportedEncodingException e)
        {
            return null;
        }
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++)
        {
            int val = md5Bytes[i] & 0xFF;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static String Encode(String inStr, String code)
    {
        MessageDigest md5 = null;
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        byte[] byteArray = (byte[])null;
        try
        {
            byteArray = inStr.getBytes(code);
        }
        catch (UnsupportedEncodingException e)
        {
            return null;
        }
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++)
        {
            int val = md5Bytes[i] & 0xFF;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static void main(String[] args)
    {
        String s = new String("发送到奖励伐sdsd32");
        System.out.println("原始：" + s);
        System.out.println("MD5后：" + Encode(s));
        System.out.println("MD5后再加密：" + KL(Encode(s)));
        System.out.println("解密为MD5后的：" + JM(KL(Encode(s))));
    }
}
