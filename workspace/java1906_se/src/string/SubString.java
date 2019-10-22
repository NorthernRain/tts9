package string;

/**
 * String substring(int start,int end) 截取start-end之间的字符串 不包含end在内
 * 
 * 
 * @author tarena
 *
 */
public class SubString {
	public static void main(String[] args) {

		String line = "天保是沙雕！";

		String sub = line.substring(0, 2);
		System.out.println(sub);

		// 从指定位置截取到末尾
		sub = line.substring(2);
		System.out.println(sub);
	}
}
