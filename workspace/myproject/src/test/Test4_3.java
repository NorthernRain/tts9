package test;

import java.util.Scanner;

public class Test4_3 {
	// 4.3ѭ������5�������������ʾ��Щ������û�и���
	public static void main(String[] args) {

		/*
		 * int a=6,b=5; a=b+0*(b=a); System.out.println(a);
		 * System.out.println(b);
		 */

		Scanner scan = new Scanner(System.in);
		int[] input = new int[5];
		System.out.println("������5�����֣�");
		for (int i = 0; i < 5; i++) {
			input[i] = scan.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if(input[i]<0)
				{System.out.println("��Щ�����и�����");
				break;
				}
			if(i==4)
				System.out.println("��Щ����û�и�����");
		}
	}
}
