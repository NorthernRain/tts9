package test;

public class Test4_2 {

	public static void main(String[] args) {

		// 4.2打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
		for (int sum = 0, i = 1; i <= 100; i++) {
			if (i % 7 != 0 && i % 10 != 7 && i / 10 != 7) {
				System.out.print(i + "\0");
				sum += i;
			}
			if (i == 100) {
				System.out.println();
				System.out.print("他们的和为:" + sum);
			}
		}
	}

}
