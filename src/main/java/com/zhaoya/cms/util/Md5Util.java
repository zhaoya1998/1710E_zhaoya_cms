package com.zhaoya.cms.util;



import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @ClassName: Md5Util 
 * @Description: TODO
 * @author: zhaoya
 * @date: 2019骞�5鏈�12鏃� 涓嬪崍8:53:18
 */
public class Md5Util {
	/**
	 * 鐩存帴瀵瑰瘑鐮佽繘琛屾暎鍒楋紝閭ｄ箞榛戝鍙互瀵归�氳繃鑾峰緱杩欎釜瀵嗙爜鏁ｅ垪鍊硷紝
	 * 鐒跺悗閫氳繃鏌ユ暎鍒楀�煎瓧鍏革紙渚嬪MD5瀵嗙爜鐮磋В缃戠珯锛夛紝寰楀埌鏌愮敤鎴风殑瀵嗙爜銆�
	 * 鍔燬alt鍙互涓�瀹氱▼搴︿笂瑙ｅ喅杩欎釜闂
	 */
	//鍔犵洂鍊� :
	private static String salt="1a2b3c4d";
	
	public static String md5Encoding(String password) {
		
		return  DigestUtils.md5Hex(password + salt);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Md5Util.md5Encoding("1"));
		System.out.println(Md5Util.md5Encoding("1"));
		//System.out.println(DigestUtils.md5Hex("123456"));
		
	}
}
