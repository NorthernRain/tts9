package chicken;

public class Chicken {

	public static void main(String[] args) {
		/*
		100Ԫ��100ֻ����5Ԫһֻ������3Ԫһֻĸ����1Ԫ��ֻС����
		*
		*
		*/
		int x, y, z;
		for (x = 0; x <=20; x++) {
			for (y = 0; y <= 33; y++) {
				z = 100 - x - y;
				if (5 * x + 3 * y + z / 3.0 == 100)
					System.out.println("������" + x + "ֻ\t" + "ĸ����" + y + "ֻ\t" + "С����" + z + "ֻ");

			}

		}

	}

}
