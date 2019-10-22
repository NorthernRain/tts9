package binary_convert;

public class Binary_toDecimal {

	public static void main(String[] args) {
		int n=10;
		for (int i =3; i>=0; i--) {
			System.out.println(n>>>i&1);
			//System.out.print(n>>>i&1);
		}

	}

}
