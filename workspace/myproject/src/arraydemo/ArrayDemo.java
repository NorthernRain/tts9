package arraydemo;

public class ArrayDemo {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=j;
				System.out.println(a[i][j]);
			}
		}

	}

}
