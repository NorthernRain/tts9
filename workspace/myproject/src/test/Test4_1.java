package test;

import java.util.Random;
import java.util.Scanner;

public class Test4_1 {
/*	4.1�������һ��1-100֮�������num��ѭ�����û�������������
	����û���������ִ���num��ʾ��������ֱȽϴ�
	����û����������С��num��ʾ��������ֱȽ�С��
	ֱ���û���������ֺ�num���Ϊֹ��Ȼ������û��������ܴ���*/
	public static void main(String[] args) {
		System.out.println("׼������Ϸ��ʼ����");
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int src = rand.nextInt(100);
		while(true){
		System.out.println("��������Ĵ𰸣�");
		int result = scan.nextInt();
		
			if (result < src) {
				System.out.println("���������̫С����");
			} else if (result > src) {
				System.out.println("���������̫������");
			} else {
				System.out.println("��ϲ���¶�����");
				break;
				}
			}
	}

}
