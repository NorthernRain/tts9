package string;

/**
 * 字符串提供了若干的valueOf方法，他们都是静态方法 static valueOf(xxx xxx) 作用是将给定的内容转为字符串
 * 
 * @author tarena
 *
 */
public class ValueOfDemo {

	

	public static void main(String[] args) {

		char[] arr = { '1', '2', '3', '5', '6' };
		System.out.println(String.valueOf(arr) + 4.0);

	}

	
}
