package binary;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * ����Ļ����Գ�����
		 */
		int n = 100;
		int m = ~n+1;
		System.out.println(m);//-100
		n = -66;
		m = ~n+1;
		System.out.println(m);
		//��� ~n+1 �ļ������
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(~n));
		System.out.println(Integer.toBinaryString(~n+1));
		
		//����������Ŀ��
		System.out.println(~-9);
		//A.7  B.8  C.9  D.10
		//���ϴ������������ ��    �� �𰸣�B
		
		//һ����������Ժ��Ǹ����� �𰸣���һ����
		n = 10;
		m = 10 + Integer.MAX_VALUE + 1 
				+ Integer.MAX_VALUE + 1;
		System.out.println(m); 
 	}

}







