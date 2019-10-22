package binary;

public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 补码
		 */
		int n = -3;
		System.out.println(Integer.toBinaryString(n));
		//输出int类型的最大值和最小值
		int max = Integer.MAX_VALUE; //Long.MAX_VALUE
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		System.out.println(lmax);
		System.out.println(lmin);
		System.out.println(Long.toBinaryString(lmax));
		System.out.println(Long.toBinaryString(lmin));
		
		max = 0x7fffffff;
		min = 0x80000000;
		lmax = 0x7fffffffffffffffL;
		
	}

}







