package day01;

public class Base{
	String a;
	private void test() {
		String aStr = "? One? ";
		String bStr = aStr;
		aStr=aStr.toUpperCase();
		aStr=aStr.trim();
		System.out.println("[" + aStr + "," + bStr + "]");
	}



	static public void main(String[] d) {
		new Base().test();
		System.out.println();
	}
}