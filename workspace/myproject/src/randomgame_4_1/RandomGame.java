package randomgame_4_1;

import java.util.Scanner;
import java.util.Random;


public class RandomGame {

	public static void main(String[] args) {
		System.out.println("��׼���ã���Ϸ���Ͽ�ʼ����");

		int[] random = getRandom();
		char[] letters = getLetters(random);
		for (int i = 0; i < 5; i++) {
			System.out.print(letters[i]);

		}
		System.out.println();
		gameStart(letters);

	}

	// ����һ������5������ͬ��0-26�������������
	public static int[] getRandom() {
		int[] random = new int[5];
		Random rand = new Random();
		// flag��һ�����أ���������������Ĳ�ͬ
		boolean[] flag = new boolean[26];
		for (int i = 0; i < 5; i++) {
			// ����һ��0-26�������
			int index = rand.nextInt(26);
			// �����һ�β���������Ͳ�ѭ��
			while (flag[index]) {
				index = rand.nextInt(26);
			}
			// �������������Ϊtrue��ʾ�Ѿ���������
			flag[index] = true;
			random[i] = index;
		}
		return random;
	}

	// ��������������ĸ
	public static char[] getLetters(int[] random) {
		char[] letters = new char[5];
		char[] originalLetters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (int i = 0; i < random.length; i++) {
			letters[i] = originalLetters[random[i]];
		}
		return letters;
	}

	// ��Ϸ��ʼ���Ա����������ַ��ͺ�̨���ɵ��ַ�
	public static void gameStart(char[] letters) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// ���������ַ���
		String input = null;
		// ��ʼ����500
		int score = 500;
		// �жϲ¶Եĸ���
		int index = 0;
		while (index < 5 && score > 0) {
			index = 0;
			System.out.println("��������Ĵ𰸣�");
			input = scan.next().toUpperCase();
			if (input.equals("EXIT"))
				break;
			char[] result = input.toCharArray();
			while (result.length != 5) {
				if (input.equals("EXIT"))
					break;
				System.out.println("�ַ����Ƿ�����������������");
				input = scan.next().toUpperCase();
				result = input.toCharArray();
			}
			// �Ƚ�������ɵ��ַ������������ַ�
			for (int i = 0; i < result.length; i++) {

				for (int j = 0; j < letters.length; j++) {
					// �¶Լ�һ
					if (result[i] == letters[j]) {
						index++;
						break;
					}
				}
			}
			// һ��û�¶Կ�10��
			if (index < 5)
				score -= 10;
			if (score > 0)
				System.out.println("�¶���" + index + "�������������Ŷ��");
			else
				System.out.println("���ź�����Ļ����þ���!���÷�����" + score);
		}
		if (score > 0 && !(input.equals("EXIT")))
			System.out.println("��ϲ��¶��������÷�����" + score);
		System.out.println("��Ϸ������");
	}
}
