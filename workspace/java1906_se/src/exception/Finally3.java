package exception;

/**
 * 面试中的finally常见问题
 * 
 * 
 * 请分别说明final finally finalize
 * finalize方法是在object中定义的方法 ，该方法是当GC释放该对象资源是调用此方法 
 * ，调用后该对象即被释放。
 * 注意，此方法若要重写，里面不能写耗时的操作。
 * 
 * @author tarena
 *
 */
public class Finally3 {
	public static void main(String[] args) {
System.out.println(test(null)+"+"+test("")+"+"+test("0"));
	}

	public static int test(String str) {
		try {
			return str.charAt(0) - '0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			//return 3;
		}
	}
}
