package string;

/**
 * String 是一个不变对象，如果要改变他的话，就需要重新新建一个字符串对象 而如果用字面量创建字符串的时候，会先在字符串常量池里面寻找有没有一样的字符串
 * 如果有就不会创建新的字符串，会直接使用常量池里面的内容 而如果是字符串变量的拼接的话 就会重新new一个字符串
 * 
 * @author tarena
 *
 */
public class StringDemo {
	public static void main(String[] args) {

		
		String str1="hello";
		String str2="hello";
		String str3="he";
		String str4="llo";
		String str5="he"+"llo";
		String str6=str3+str4;
		String str7=str3+"llo";
		
		System.out.println(str1==str2);
		System.out.println(str1==str5);
		System.out.println(str1==str6);
		System.out.println(str1==str7);
		
		
	}
}
