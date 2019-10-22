package stairs;

public class StairsDemo {
	public static void main(String[] args) {

	System.out.println(sum(7));

		

	}

	public static long sum(int stairs) {
		if (stairs == 1)
			return 1;
		else if (stairs == 2) {
			return 2;
		} else
			return sum(stairs - 1) + sum(stairs - 2);

	}
}
