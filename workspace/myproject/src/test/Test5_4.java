package test;

public class Test5_4 {

	public static void main(String[] args) {
		/*
		 * // 5.4������һֻ��ţ��������������5�ף����ϵ�3.5�ף�����56.7�� ������ţ��Ҫ��������ܴӾ��׵�������
		 */
		double height = 56.7;
		int day = 0;
		while(height>5){
			height-=1.5;
			day++;
		}
		if(height>0)
			day++;
		System.out.println(day);
	}

}
