package string;
/**
 * trim()
 * 将字符串里面的空格去除  但是字符串中间的空格无法去除
 * @author tarena
 *
 */


public class TrimDemo {
	public static final int i;
	static{
		i=0;
	}
	public TrimDemo() {
		
	}
	
	public static void main(String[] args) {
		String str="   thingking in java";
		str=str.trim();
		System.out.println(str);
		TrimDemo trimDemo=new TrimDemo();
		
		int a=trimDemo.i;
	System.out.println(a);
	}
}
