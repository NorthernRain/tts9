package string;

import java.util.Arrays;

/**
 * String split(String regex)
 * 此方法是将满足正则表达式
 *的字符串从当前字符串中剔除 
 * 
 * @author tarena
 *
 */
public class SplitDemo {

	
	public static void main(String[] args) {
		
		String string="hello world";
		String[] s=string.split("o");
		System.out.println(Arrays.toString(s));
		
		
	}
}
