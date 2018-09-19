package cn.vpclub.coupon.api.utils.ek;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util
{
  private static char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

  public static String MD5(String s)
  {
    return hex(s.getBytes());
  }

  public static String MD5(byte[] b)
  {
    return hex(b);
  }

  private static String hex(byte[] b)
  {
    try
    {
      MessageDigest mdInst = MessageDigest.getInstance("MD5");

      mdInst.update(b);

      byte[] md = mdInst.digest();

      int j = md.length;
      char[] str = new char[j * 2];
      int k = 0;
      for (int i = 0; i < j; i++)
      {
        byte byte0 = md[i];
        str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
        str[(k++)] = hexDigits[(byte0 & 0xF)];
      }
      return new String(str);
    }
    catch (NoSuchAlgorithmException e)
    {
      e.printStackTrace();
    }return null;
  }

//  public static void main(String[] args)
//  {
//    String p = "00000001APP0000000120130924172242";
//    System.out.println(MD5(p));
//  }
}