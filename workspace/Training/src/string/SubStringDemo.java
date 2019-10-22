package string;
/**
 * String subString(int a,int b);
 * 裁剪a-b位置的字符
 * @author tarena
 *
 */
public class SubStringDemo {
public static void main(String[] args) {
	String str1="hello world";
	String str2=str1.substring(2);
	System.out.println(str2);
	String str3=str1.substring(2,6);
	System.out.println(str3);
	
}
}
