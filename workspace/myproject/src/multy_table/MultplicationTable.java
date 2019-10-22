package multy_table;

public class MultplicationTable {

	public static void main(String[] args) {
		for(int i=1,j=1;j<=9;i++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
			if(i==j)
			{System.out.println();
			i=0;
				j++;
			}

		}
	}

}
