package chicken;

public class Chicken {

	public static void main(String[] args) {
		/*
		100元买100只鸡，5元一只公鸡，3元一只母鸡，1元三只小鸡。
		*
		*
		*/
		int x, y, z;
		for (x = 0; x <=20; x++) {
			for (y = 0; y <= 33; y++) {
				z = 100 - x - y;
				if (5 * x + 3 * y + z / 3.0 == 100)
					System.out.println("公鸡：" + x + "只\t" + "母鸡：" + y + "只\t" + "小鸡：" + z + "只");

			}

		}

	}

}
