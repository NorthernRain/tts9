package test;

import java.util.Scanner;

public class Test3_3 {

	public static void main(String[] args) {

		/*
		 * 3.3ѡ��һ����״��1�����Ρ�2�����Ρ�3�����Ρ�4Բ�Σ� ���ݲ�ͬ��ѡ�����û����벻ͬ����Ϣ�� �������г��Ϳ� �������б߳���
		 * �������е׺͸ߡ� Բ���а뾶�� �������ָ����״�����
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ��һ��ͼ�Σ������Ρ������Ρ������Ρ�Բ�Σ�");
		String shape=scan.next();
		if(shape.equals("������")){
			System.out.println("�����볤���εĳ���");
			double length=scan.nextDouble();
			System.out.println("�����볤���εĿ�");
			double width=scan.nextDouble();
			System.out.println("�˳����ε����Ϊ"+length*width);
			
			
		}else if(shape.equals("������")){
			System.out.println("�����������εı߳���");
			double length=scan.nextDouble();
			System.out.println("�˳����ε����Ϊ"+length*length);
		}else if(shape.equals("������")){
			System.out.println("�����������εĵף�");
			double length=scan.nextDouble();
			System.out.println("�����������εĸߣ�");
			double width=scan.nextDouble();
			System.out.println("�˳����ε����Ϊ"+length*width/2);
		}else{
			System.out.println("������Բ�İ뾶��");
			double radius=scan.nextDouble();
			System.out.println("�˳����ε����Ϊ"+radius*radius*Math.PI);
		}

	}

}
