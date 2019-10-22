package test;

import java.util.Scanner;

public class Test4_3 {
	// 4.3循环输入5个数，输完后显示这些数中有没有负数
	public static void main(String[] args) {

		/*
		 * int a=6,b=5; a=b+0*(b=a); System.out.println(a);
		 * System.out.println(b);
		 */

		Scanner scan = new Scanner(System.in);
		int[] input = new int[5];
		System.out.println("请输入5个数字：");
		for (int i = 0; i < 5; i++) {
			input[i] = scan.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if(input[i]<0)
				{System.out.println("这些数里有负数！");
				break;
				}
			if(i==4)
				System.out.println("这些数里没有负数！");
		}
	}
}
