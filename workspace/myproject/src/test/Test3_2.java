package test;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {

		/*
		 * 3.2��Ʊ�۸��յ���������ͷ�Ȳպ;��ò��շѡ� �����Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼òգ� ����������5-10�£�ͷ�Ȳ�9�ۣ����ò�85�ۣ�
		 * ������11�µ�����4�£�ͷ�Ȳ�7�ۣ����ò�65�ۣ� ���������Ʊ�۸�
		 */
		Scanner scan = new Scanner(System.in);
		double count=0;
		System.out.println("�������Ʊԭ�ۣ�");
		double price = scan.nextDouble();
		System.out.println("�����빺Ʊ�·ݣ�");
		int mon = scan.nextInt();
		System.out.println("�����뾭�òջ���ͷ�Ȳգ�");
		String str = scan.next();
		switch (mon) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10: {
			if (str.equals("���ò�"))
				count = price * 0.85;
			else
				count = price * 0.9;
		}
			break;
		case 11:
		case 12:
		case 1:
		case 2:
		case 3:
		case 4: {
			if (str.equals("���ò�"))
				count = price * 0.65;
			else
				count = price * 0.7;
		}
			break;

		}
		System.out.println("��Ӧ��֧��"+count+"Ԫ");
	}

}
