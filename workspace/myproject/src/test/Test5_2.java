package test;

public class Test5_2 {

	public static void main(String[] args) {
		/*
		 * ��һ��400��һȦ�Ĳٳ���һ����Ҫ��10000�ף� ��һȦ50�룬���ÿһȦ����ǰһȦ��1�룬 ������������������10000����Ҫ������
		 */
		int total = 10000;
		double second = 0, pSecond = 50;
		while (total >= 400) {
			total -= 400;
			second += pSecond;
			pSecond++;
		}
		if (total != 0)
			second += total / 400.0 * pSecond;
		System.out.println(second);
	}

}
