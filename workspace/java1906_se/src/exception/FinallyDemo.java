package exception;



/**
 * finally块： finally块是异常处理机制中的最后一部分， 他可以直接跟在try语句块之后或者最后一个catch块之后.
 * finally可以保证只要程序执行到try当中，无论是否出现异常 ，finally中的代码都必定执行.
 * 
 * 通常我们可以将释放资源这样的必须操作的代码放在这里.
 * 
 * @author tarena
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			String str="1";
			System.out.println(str.length());
			return ;
		} catch (Exception e) {
			System.out.println("error!");
			
		}finally {
			System.out.println("this is finally!");
		}
		
		System.out.println("end");
		
		
	}
}
