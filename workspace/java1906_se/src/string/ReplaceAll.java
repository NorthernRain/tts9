package string;

/**
 * String 支持的正则表达式的方法三： String replaceAll(String regex，String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的内容
 * 
 * 
 * @author tarena
 *
 */
public class ReplaceAll {

	public static void main(String[] args) {
		String str = "我就是个杠精，还是SSS级别的那种！";
		// 将sss换为最强级别
		str=str.replaceAll("S+", "最强");
		System.out.println(str);
	}

}
