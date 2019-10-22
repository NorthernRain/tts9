package string;

/**
 * 
 * char chaAt(int index) 获取当前字符串中指定位置对应的字符
 * 
 * @author tarena
 *
 */
public class CharAtDemo {

	public static void main(String[] args) {
		String str = "thinking in java";
		System.out.println(str.charAt(5));

		// 判断回文
		str = "上海自来水来  自海上";
		for (int i = 0; i <= str.length() / 2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length() - 1 - i);
			if (c1 != c2) {
				System.out.println("不是回文");
				return;
			}

		}
		System.out.println("是回文");

		/*
		 * for (int i = 0; i <= str.length() / 2; i++) { char c1 =
		 * str.charAt(i); char c2 = str.charAt(str.length() - 1 - i); if (c1 !=
		 * c2) { System.out.println("不"); break; }
		 * 
		 * } System.out.println("是回文");
		 */

	}

}
