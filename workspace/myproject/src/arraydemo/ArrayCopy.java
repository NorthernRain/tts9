package arraydemo;
import java.util.Arrays;
public class ArrayCopy {
public static void main(String[] args){
	
	
	int[] x=new int[]{1,2,3,4,5,6};
	int[] y=new int[4];
	System.arraycopy(x, 2, y, 1, 3);
	String str=Arrays.toString(y);
	System.out.println(str);
	int[] z=Arrays.copyOf(x, 10);
	str=Arrays.toString(z);
	System.out.println(str);

}
}
