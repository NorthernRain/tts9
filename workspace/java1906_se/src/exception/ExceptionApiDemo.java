package exception;

/**
 * 异常的常用方法
 * 
 * @author tarena
 *
 */
public class ExceptionApiDemo {
	public static void main(String[] args) {
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			e.printStackTrace();
			String message=e.getMessage();
			System.out.println(message);
		}
		System.out.println("The End!");
	}
}
