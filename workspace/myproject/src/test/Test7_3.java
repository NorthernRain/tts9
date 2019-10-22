package test;

public class Test7_3 {

	public static void main(String[] args) {
		/*
		 * 7.3向一个长度为5的整型数组中随机生成5个1-10的随机整数 要求生成的数字中没有重复数
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
