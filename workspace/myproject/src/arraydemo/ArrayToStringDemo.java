package arraydemo;

import java.util.Arrays;

public class ArrayToStringDemo {

	public static void main(String[] args) {
		char[] chars = new char[] { 'h', 'e', 'l', 'l', 'o' };
		String str = Arrays.toString(chars);
		System.out.println(str);
		int[] a = { 0, 1, 2 };
		str = String.valueOf(a);
		str = Arrays.toString(a);
		System.out.println(str);
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			s.append(a[i]);
		}
		str = s.toString();
		System.out.println(str);

	}

}
