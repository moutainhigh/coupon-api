package cn.vpclub.coupon.api.thirdparty.kfc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * MD5 , HSA加密类<br>
 * 
 * @author 鲍庆丰 baoqingfeng@gmail.com<br>
 *         MD5是一种不可逆加密方法<br>
 *         示例:<br>
 *         MD5("09876543211234567890");加字符串进行MD5加密<br>
 */
public class Security {
	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	/**
	 * 作者：清风<br>
	 * 生成日期：2007-12-27 下午04:04:28<br>
	 * 功能描述：1个字节转换为16进制字符串<br>
	 * 
	 * @param s
	 *            16进制字符串
	 * @return 转换后的字节流 <br>
	 *         Security.hexStringToByteArray("01051abc") -> 0x01,0x05,0x1a,0xbc
	 */
	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();

		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	/**
	 * 作者：清风<br>
	 * 生成日期：2007-12-27 下午04:04:28<br>
	 * 功能描述：1个字节转换为16进制字符串<br>
	 * 
	 * @param s
	 *            16进制字符串
	 * @return 转换后的字节流 <br>
	 *         Security.hexStringToByteArray("01051abc") -> 0x01,0x05,0x1a,0xbc
	 */
	private static String byteToHexString(byte b) {
		int n = b;

		if (n < 0) {
			n = 256 + n;
		}

		int d1 = n / 16;
		int d2 = n % 16;

		return hexDigits[d1] + hexDigits[d2];
	}

	/**
	 * 作者：清风<br>
	 * 生成日期：2007-12-27 下午04:04:28<br>
	 * 功能描述：16进制字符串转换为字节流<br>
	 * 
	 * @param s
	 *            16进制字符串
	 * @return 转换后的字节流 <br>
	 *         Security.hexStringToByteArray("01051abc") -> 0x01,0x05,0x1a,0xbc
	 */
	public static byte[] hexStringToByteArray(String s) {
		byte[] b = new byte[s.length() / 2];

		for (int i = 0; i < b.length; i++) {
			int index = i * 2;
			int v = Integer.parseInt(s.substring(index, index + 2), 16);
			b[i] = (byte) v;
		}

		return b;
	}

	/**
	 * 作者：清风<br>
	 * 生成日期：2007-12-27 下午04:04:28<br>
	 * 功能描述：MD5加密<br>
	 * 
	 * @param origin
	 *            原始字符串
	 * @return 加密串
	 */
	public static String MD5(String origin) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			origin = byteArrayToHexString(md.digest(origin.getBytes("utf-8")));
		} catch (Exception ex) {
		}
		return origin;
	}

	public static String MD5(String origin, String charset) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			origin = byteArrayToHexString(md.digest(origin.getBytes(charset)));
		} catch (Exception ex) {
		}
		return origin;
	}

	/**
	 * 作者：清风<br>
	 * 生成日期：2007-12-27 下午04:04:28<br>
	 * 功能描述：SHA加密<br>
	 * 
	 * @param origin
	 *            原始字符串
	 * @return 加密串
	 */
	public static String SHA1(String origin) {
		String resultString = null;

		// 使用getInstance("算法")来获得消息摘要,这里使用SHA-1的160位算法
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");

			md.update(origin.getBytes());

			// 输出算法运算结果
			resultString = Security.byteArrayToHexString(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return resultString;
	}

	/**
	 * 功能描述：对多个字段md5后的结果再做异或操作
	 * 
	 * 消除了参数字符串连接后md5中存在的参数次序问题
	 * 
	 * @param items
	 * @return
	 */
	public static String encrypt(String... items) {
		if (items == null || items.length < 1 || items[0] == null || items[0].length() == 0) {
			return null;
		}

		List<String> list = new ArrayList<String>();
		for (String item : items) {
			list.add(item);
		}
		return encrypt(list);
	}

	public static String encrypt(List<String> items) {
		String result = null;
		do {
			if (items == null || items.size() < 1 || items.get(0) == null || items.get(0).length() == 0) {
				break;
			}
			byte[] bFirestItem = hexStringToByteArray(MD5(items.get(0)));
			for (int i = 1; i < items.size(); i++) {
				if (items.get(i) == null || items.get(i).length() == 0) {
					continue;
				}
				byte[] bItem = hexStringToByteArray(MD5(items.get(i)));
				for (int j = 0; j < bFirestItem.length; j++) {
					bFirestItem[j] = (byte) ((int) bFirestItem[j] ^ (int) bItem[j]);
				}
			}
			result = byteArrayToHexString(bFirestItem);
		} while (false);
		return result;
	}

	public static void main1(String[] args) throws Exception {
		System.out.println(encrypt("123456"));
	}
}
