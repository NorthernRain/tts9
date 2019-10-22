package string;

/**
 * String支持正则表达式方法二： String[] split(string regex)
 * 
 * 将当前字符串中按照满足正则表达式的部分拆分 然后将拆分后的字符串以数组形式返回
 * 
 * @author tarena
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String line = "coldrain1a 69 a35c7578om";
		/*
		 * 按照数字部分拆分 如果拆分过程中遇到两个连续的的匹配内容时 中间会拆分出一个空格符 但是如果在字符串末尾连续匹配 就不会有空格
		 * 
		 *  
		 */
		String[] data = line.split("[0-9\\s]+");

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			buffer.append(data[i]);
		}
	/*	String str = buffer.toString();
		String[] data1 = str.split(" ");
		StringBuffer buffer1 = new StringBuffer();
		for (int i = 0; i < data1.length; i++) {
			buffer1.append(data1[i]);
		}*/
		System.out.println(buffer.toString());

		System.out.println(buffer.length());

	}
}
