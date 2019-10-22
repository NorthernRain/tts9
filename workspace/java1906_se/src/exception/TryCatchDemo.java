package exception;

import java.util.EmptyStackException;

/**
 * java异常处理机制中的try catch try{ } catch(){ }
 * 
 * 或者 try{ } finally{ }
 * 
 * @author tarena
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {

		try {
			// String str = null;
			// String str = "";
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			System.out.println("!!!!!");
		}

		catch (NullPointerException e) {
			System.out.println("------");

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("字符串下标越界！");

		} catch (NumberFormatException e) {
			System.out.println("数字转换异常！");
			//return;
		}

		catch (Exception e) {
			System.out.println("对不起，我们遇到了一个未知错误！");

		}finally {
			System.out.println("finally!");
		}
		System.out.println("gooldbye!");
	}
}
