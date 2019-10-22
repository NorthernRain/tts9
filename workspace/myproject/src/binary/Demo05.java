package binary;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 补码的互补对称现象
		 */
		int n = 100;
		int m = ~n+1;
		System.out.println(m);//-100
		n = -66;
		m = ~n+1;
		System.out.println(m);
		//输出 ~n+1 的计算过程
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(~n));
		System.out.println(Integer.toBinaryString(~n+1));
		
		//经典面试题目：
		System.out.println(~-9);
		//A.7  B.8  C.9  D.10
		//如上代码的运算结果是 （    ） 答案：B
		
		//一个正数溢出以后是负数？ 答案：不一定！
		n = 10;
		m = 10 + Integer.MAX_VALUE + 1 
				+ Integer.MAX_VALUE + 1;
		System.out.println(m); 
 	}

}







