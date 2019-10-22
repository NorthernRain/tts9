package integer;

/**
 * 包装类 包装类是为了解决基本类型不能直接参与面向对象开发的问题。
 * 8个基本类型对应8个不同的包装类，其中6个表示数字的包装类继承自java.lang.Number， 其他两个继承自Object
 * (boolean-Boolean 和 char-Character)
 * 
 * 
 * @author tarena
 *
 */
public class IntegerDemo {
	
	public static void main(String[] args) {
	
		int d = 129;
		/*
		 * Integer i1=new Integer(d); Integer i2=new Integer(d);
		 *
		 *
		 * valueOf只会缓存-128-127 超出就会new java推荐我们使用包装类的静态方法valueOf方法将基本类型转换为包装类
		 */

		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);

		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		// 包装类转化回基本类型
		int i = i1.intValue();
		System.out.println(i);
		byte b = i1.byteValue();
		System.out.println(b);
		double dou = i1.doubleValue();
		System.out.println(dou);
		System.out.println(Math.PI);

		// 此方法将字符串转化成基本类型，但是前提是只能转化成对应的基本类型
		String string = "123";
		int in = Integer.parseInt(string);
		System.out.println(in);

	}

}
