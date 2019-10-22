package test;

public class Test5_4 {

	public static void main(String[] args) {
		/*
		 * // 5.4井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米 计算蜗牛需要多少天才能从井底到爬出来
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
