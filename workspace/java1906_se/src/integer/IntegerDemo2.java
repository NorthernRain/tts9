package integer;

/**
 * 
 * java1.5以后对包装类添加了自动拆装箱功能 这里是编译器认可的，不是jvm认可 编译器会在转化的过程中提供自动转化
 * 
 * @author tarena
 *
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		//自动拆箱 int i=new Integer(1).intValue();
		int i = new Integer(1);
		// 自动装箱Integer in=new Integer(i);

		Integer in = i;
	}

}
