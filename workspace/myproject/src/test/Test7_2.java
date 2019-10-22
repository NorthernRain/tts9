package test;

public class Test7_2 {

	public static void main(String[] args) {
		/*
		 * 向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务 1)升序输出 2)输出总和、平均数
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
