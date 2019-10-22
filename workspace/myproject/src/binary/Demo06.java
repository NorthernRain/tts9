package binary;

public class Demo06 {

	public static void main(String[] args) {
		/**
		 * 按位与计算
		 */
		int n = 0x69f55f29;
		int m = 0xff;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		n = 0x67a7d5eb;
		m = n%8;
		k = n&7;
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
	}

}



