package bottles;

//20元买汽水，一元一瓶，2个空瓶换一瓶，3个瓶盖换一瓶
public class Bottles {
	public static void main(String[] args) {

		System.out.println(sum(100, 0, 0));
		int number = 0;
		for (int i = 1, bottoles = 0, caps = 0; i <=100; i++) {
			bottoles += 1;
			caps += 1;
			number += 1;
			while ((bottoles / 2 + caps / 3) != 0) {
				int b = 0;

				number += bottoles / 2 + caps / 3;
				b = bottoles / 2 + caps / 3;
				bottoles = bottoles / 2 + caps / 3 + bottoles % 2;
				caps = caps % 3 + b;

			}

		}
		System.out.println(number);
	}

	public static int sum(int money, int bottoles, int caps) {
		bottoles += money;
		caps = money + caps;
		if (bottoles / 2 + caps / 3 == 0) {
			return bottoles;
		} else {

			return money + sum(bottoles / 2 + caps / 3, bottoles % 2, caps % 3);
		}

	}

}
