package binary;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * ????????????
		 */
		int n = -1;
		System.out.println(Integer.toBinaryString(n));
		n = -6;
		System.out.println(Integer.toBinaryString(n));
		//??? -50 ~ -1 ?????
		int i = -50;
		while(i < 0) {
			System.out.println(
				Integer.toBinaryString(i++));
		}
	}

}



