package string;

/**
 * String支持正则表达式的方法之一： boolean matches(String regex) 使用给定的正则表达式匹配当前的字符串是否符合格式要求
 * ，符合返回true
 *
 * 注意：给定的正则表达式就算不指定边界匹配符 即：(^...$)也是做完全匹配验证的 注：^表示字符串的开头$表示字符串的结尾
 * 
 * @author tarena
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String email = "1218680620@qq.com";
		// [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		// \\表示转义\
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";

		System.out.println(email.matches(regex));

	}
}
