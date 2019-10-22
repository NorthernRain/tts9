package binary_convert;

import java.util.Scanner;

public class DecimalToBin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dec = 0;
		String bin = "";
		System.out.println("请输入一个十进制数：");
		dec = scan.nextInt();
		while (dec != 0) {
			bin += dec % 2;
			dec /= 2;
		}
		StringBuilder sb = new StringBuilder(bin);
		bin = sb.reverse().toString();
		System.out.println(bin);
	}

}
