package string;
/**
 * boolean startsWith(String str);
 * 判断这个字符串是否以给定的字符串开头
 * boolean endsWith(string str)；
 * 判断这个字符是否以给定字符串结尾
 * @author tarena
 *
 */
public class StartsWith {
public static void main(String[] args) {
	String str="thinking in java";
	boolean f=str.startsWith("th");
	System.out.println(f);
	
	boolean f1=str.endsWith("va");
	System.out.println(f1);
	
}
}
