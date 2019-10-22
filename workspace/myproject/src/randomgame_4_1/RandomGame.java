package randomgame_4_1;

import java.util.Scanner;
import java.util.Random;


public class RandomGame {

	public static void main(String[] args) {
		System.out.println("请准备好，游戏马上开始啦！");

		int[] random = getRandom();
		char[] letters = getLetters(random);
		for (int i = 0; i < 5; i++) {
			System.out.print(letters[i]);

		}
		System.out.println();
		gameStart(letters);

	}

	// 生成一个包含5个不相同的0-26的随机数的数组
	public static int[] getRandom() {
		int[] random = new int[5];
		Random rand = new Random();
		// flag是一个开关，控制生成随机数的不同
		boolean[] flag = new boolean[26];
		for (int i = 0; i < 5; i++) {
			// 产生一个0-26的随机数
			int index = rand.nextInt(26);
			// 如果第一次产生这个数就不循环
			while (flag[index]) {
				index = rand.nextInt(26);
			}
			// 将这个数的门置为true表示已经产生过了
			flag[index] = true;
			random[i] = index;
		}
		return random;
	}

	// 生成五个随机的字母
	public static char[] getLetters(int[] random) {
		char[] letters = new char[5];
		char[] originalLetters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (int i = 0; i < random.length; i++) {
			letters[i] = originalLetters[random[i]];
		}
		return letters;
	}

	// 游戏开始，对比玩家输入的字符和后台生成的字符
	public static void gameStart(char[] letters) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// 玩家输入的字符串
		String input = null;
		// 初始分数500
		int score = 500;
		// 判断猜对的个数
		int index = 0;
		while (index < 5 && score > 0) {
			index = 0;
			System.out.println("请输入你的答案：");
			input = scan.next().toUpperCase();
			if (input.equals("EXIT"))
				break;
			char[] result = input.toCharArray();
			while (result.length != 5) {
				if (input.equals("EXIT"))
					break;
				System.out.println("字符数非法！！！请重新输入");
				input = scan.next().toUpperCase();
				result = input.toCharArray();
			}
			// 比较随机生成的字符和玩家输入的字符
			for (int i = 0; i < result.length; i++) {

				for (int j = 0; j < letters.length; j++) {
					// 猜对加一
					if (result[i] == letters[j]) {
						index++;
						break;
					}
				}
			}
			// 一次没猜对扣10分
			if (index < 5)
				score -= 10;
			if (score > 0)
				System.out.println("猜对了" + index + "个，请继续加油哦！");
			else
				System.out.println("很遗憾！你的机会用尽了!所得分数：" + score);
		}
		if (score > 0 && !(input.equals("EXIT")))
			System.out.println("恭喜你猜对啦！所得分数：" + score);
		System.out.println("游戏结束！");
	}
}
