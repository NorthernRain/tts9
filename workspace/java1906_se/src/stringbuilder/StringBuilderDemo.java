package stringbuilder;

/**
 * String 的优化措施仅照顾重用性，因此频繁修改字符串会带来内存开销大， 运行效率差的问题。
 * 
 * 对此 java提供了一个专门修改字符串的API java.lang.StringBuilder
 * 其内部维护一个可变的char数组，所有的修改都是在这个数组中进行的， 因此开销小性能好
 * 
 * 
 * @author tarena
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "买彩票中500W！";

		StringBuilder s = new StringBuilder(str);
		s.append("我就去买房！");
		System.out.println(s.toString());

		// 替换x-y之间的字符
		s.replace(0, 0, "如果");
		System.out.println(s.toString());

		s.delete(0, 2);
		System.out.println(s.toString());
		// 插入
		s.insert(0, "emmm");
		System.out.println(s.toString());
	
	}

}
