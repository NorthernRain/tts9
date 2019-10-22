package object;

/**
 * 
 * 测试object相关方法 的重写
 * 
 * 
 * @author tarena
 *
 */
public class Demo {

	public static void main(String[] args) {
		Point point = new Point(1, 2);
		/*
		 * 
		 * object 两个常被重写的方法 1： String toString(); 该方法的设计意义是将一个对象转换为一个字符串。
		 * Object本身实现的toString方法返回的是该对象的句柄，机构还对象的引用地址。格式为：@地址 2: boolean
		 * equals(Object obj);
		 * 该方法是比较两个对象的内容是否一致。相同则返回true.当我们重写equals方法是，必须连同hashCode（）方法一起重写
		 * 
		 * 
		 */

		String str = point.toString();
		System.out.println(str);
		str.equals(str);
		// 该方法将给定对象的toString方法返回的字符串输出到控制台
		System.out.println(point);
		Point point1 = new Point(1, 2);
		System.out.println(point == point1);
		System.out.println(point.equals(point1));
	}
}
