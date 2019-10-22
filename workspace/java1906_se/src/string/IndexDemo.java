package string;

/**
 * 
 * 
 * int indexOf(String str) 查找给定字符串在当前字符串中的位置， 若当前字符串不包含给定的字符串则返回-1；
 * 
 * @author LeafDust
 *
 */

public class IndexDemo {

	public static void main(String[] args) {
		String str = "thinking in java";
		// 查找in从开头到第一次出现的位置
		int index = str.indexOf("in");
		System.out.println(index);
		// 查找in从第三个开始出现的位置
		index = str.indexOf("in", 3);
		System.out.println(index);
		// 查找in最后一次出现的位置
		index = str.lastIndexOf("in");
		System.out.println(index);
		//查找指定位之前in最后一次出现的位置
		index = str.lastIndexOf("in", 5);
		System.out.println(index);

	}
}
