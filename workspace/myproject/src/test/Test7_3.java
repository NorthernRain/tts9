package test;

public class Test7_3 {

	public static void main(String[] args) {
		/*
		 * 7.3��һ������Ϊ5�������������������5��1-10��������� Ҫ�����ɵ�������û���ظ���
		 */
		int[] num = new int[5];
		boolean[] flag = new boolean[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			while(flag[num[i]-1])
				num[i] = (int) (Math.random() * 10 + 1);
			flag[num[i]-1]=true;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
