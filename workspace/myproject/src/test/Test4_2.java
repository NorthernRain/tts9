package test;

public class Test4_2 {

	public static void main(String[] args) {

		// 4.2��ӡ��1-100֮�����в���7�ı����Ͳ�����7�����֣������
		for (int sum = 0, i = 1; i <= 100; i++) {
			if (i % 7 != 0 && i % 10 != 7 && i / 10 != 7) {
				System.out.print(i + "\0");
				sum += i;
			}
			if (i == 100) {
				System.out.println();
				System.out.print("���ǵĺ�Ϊ:" + sum);
			}
		}
	}

}
