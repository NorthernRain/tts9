package test;

import java.util.Scanner;

public class Test5_3 {
	// 5.3�û���������һ�����������λ����֮��
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		int input = scan.nextInt();
		int sum = 0;
		while (input != 0) {
			sum += input % 10;
			input /= 10;

		}
		System.out.println("������ĸ�λ֮��Ϊ��" + sum);
	}

}
