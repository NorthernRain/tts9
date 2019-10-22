package string;

/**
 * 
 * boolean startsWith(String str) boolean endsWith(String str)
 * 判断字符串是否以给定的字符串或者结尾
 * 
 * 
 * @author tarena
 *
 */
public class StartWithDemo {
	public static void main(String[] args) {

		String str = "天保是沙雕！";

		System.out.println(str.startsWith("天"));
		System.out.println(str.endsWith("！"));
	}
}
