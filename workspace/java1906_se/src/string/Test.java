package string;

/**
 * 实现方法 完成截取给定地址中的域名
 * 
 * @author tarena
 *
 */

public class Test {
	public static void main(String[] args) {
		System.out.println(getHostName("www.tedu.cn"));
		System.out.println(getHostName("http://www.google.cn"));
		System.out.println(getHostName("doc.tedu.com.cn"));

	}

	public static String getHostName(String str) {
		int index1 = str.indexOf(".");
		int index2 = str.indexOf(".", index1 + 1);

		return str.substring(index1 + 1, index2);

	}

}
