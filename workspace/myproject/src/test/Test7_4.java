package test;

import java.util.Arrays;

public class Test7_4 {

	public static void main(String[] args) {
		/*
		 * ��ѡ������һ������Ϊ10�������������������10��0~9���������������������� 1)ͳ��ÿ�����ֳ����˶��ٴ� 2)������ִ�����������
		 * 3)���ֻ����һ�ε���������С������
		 */
		int[] num = new int[10];
		// ����һ������ȥ��¼0-9���������˶��ٴΣ������switch������õ���
		int[] index = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			/*
			 * switch (num[i]) { // 0ÿ����һ�Σ���Ӧ��index[0]�ͻ�+1; case 0: index[0]++;
			 * break; case 1: index[1]++; break; case 2: index[2]++; break; case
			 * 3: index[3]++; break; case 4: index[4]++; break; case 5:
			 * index[5]++; break; case 6: index[6]++; break; case 7: index[7]++;
			 * break; case 8: index[8]++; break; case 9: index[9]++; break; }
			 */
			index[num[i]]++;
		}
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "�����ˣ�" + index[i] + "��.");

		}

		// ����index���ҳ�index�е����ֵ�������±���ǳ��ִ��������Ǹ���
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (index[i] >= max) {
				max = index[i];
			}

		}
		for (int i = 0, j = 0; i < num.length; i++) {
			if (index[i] == max) {
				// ֻ��һ���Ļ���ֻ���һ������������ٺż�������������ͬ����
				if (j == 0) {
					System.out.print("���ִ������������ǣ�" + i);
					j++;
				} else
					System.out.print("��" + i);
			}

		}
		System.out.println();
		boolean flag = true;
		// ����index��ֻҪindex��Ԫ��Ϊ1�����������±꣬���±���ǳ���1�ε���������С���Ǹ�
		for (int i = 0; i < num.length; i++) {
			if (index[i] == 1) {
				System.out.println("ֻ����1�ε���������С�����ǣ�" + i);
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("û��ֻ����1�ε�����!");

	}

}
