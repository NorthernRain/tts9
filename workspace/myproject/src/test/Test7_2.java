package test;

public class Test7_2 {

	public static void main(String[] args) {
		/*
		 * ��һ������Ϊ10�������������������10��0~9���������������������� 1)������� 2)����ܺ͡�ƽ����
		 */
		int[] randNum = new int[10];
		int sum = 0;
		
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < randNum.length; i++) {
			for (int j = 0; j < randNum.length - i - 1; j++) {
				if (randNum[j] > randNum[j + 1])
					randNum[j] = randNum[j + 1] + 0 * (randNum[j + 1] = randNum[j]);

			}
			sum += randNum[i];
		}
		for (int i = 0; i < randNum.length; i++) {
			System.out.print(randNum[i] + "\0");
		}
		
		System.out.println();
		System.out.println( "sum="+sum);
		System.out.println( "average="+sum/10.0);

	}

}
