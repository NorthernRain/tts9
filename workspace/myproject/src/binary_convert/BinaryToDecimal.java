package binary_convert;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// ������ת10����
		Scanner scan = new Scanner(System.in);
		//һ�������ſ��أ����ƺ����ж��ǲ��Ƕ����������õ�
		boolean flag=true;
		int bin=0;
		while(flag){
		System.out.println("������һ������������");
		bin=scan.nextInt();
		int bin1=bin;
		//�ж��ǲ���Ϊ��������
		while(bin1!=0){
			//�����λ������1�ͱ�ʾ�����Ƕ����������˳���ǰѭ���������ϲ�ѭ��
			if(bin1%10>1){
				flag=true;
				System.out.println("������Ĳ��Ƕ������������������룡");
				break;}
			else
				flag=false;
			bin1=bin1/10;
		}
		
		}
		System.out.println(bin);
		int dec=0;
		int i=0;
		while(bin!=0){
		
			dec+=bin%10*Math.pow(2, i);
			bin=bin/10;
			i++;
		}
		
		System.out.println(dec);
		System.out.println(getType(dec));
	}

	
	public static String getType(Object o){
		return o.getClass().toString();
		
		
	}
}
