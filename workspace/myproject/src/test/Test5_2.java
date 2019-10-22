package test;

public class Test5_2 {

	public static void main(String[] args) {
		/*
		 * 有一个400米一圈的操场，一个人要跑10000米， 第一圈50秒，其后每一圈都比前一圈慢1秒， 按照这个规则计算跑完10000米需要多少秒
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
