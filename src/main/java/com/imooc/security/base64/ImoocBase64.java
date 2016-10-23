package main.java.com.imooc.security.base64;
import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class ImoocBase64 {
	private static String src="imooc security base64";
public static void main(String[] args) {
	jdkBase64();
}
 public static void jdkBase64(){
	 BASE64Encoder encoder=new BASE64Encoder();
	 String encode=encoder.encode(src.getBytes());
	 System.out.println("encode:"+encode);
	 BASE64Decoder decoder=new BASE64Decoder();
	try {
		//new String()
		System.out.println("decode:"+new String(decoder.decodeBuffer(encode)));
	} catch (IOException e) {
		e.printStackTrace();
	};
 }
}
