package test;

import java.util.Scanner;

public class Test5_3 {
	// 5.3用户输入任意一个整数，求各位数字之和
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int input = scan.nextInt();
		int sum = 0;
		while (input != 0) {
			sum += input % 10;
			input /= 10;

		}
		System.out.println("这个数的各位之和为：" + sum);
	}

}
