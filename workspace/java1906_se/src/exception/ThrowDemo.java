package exception;

/**
 * 异常抛出 throw关键字，用于主动抛出一个异常. 通常一下情况下我们会主动抛出异常： 1： 程序遇到一个满足语法要求，但是不满足业务逻辑要求时，
 * 我们可以主动抛出异常告知调用方不应该这样做。 2：程序确实出现了异常，但是该异常不应当在当前的代码片段被解决时可以对外抛出给调用方法解决。
 * 
 * @author tarena
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		/*
		 * 当调用一个含有throws声明异常抛出的方法时 编译器要求必须处理该异常，否则编译不通过 处理异常的方式有两种：
		 * 1：使用try-catch捕获并处理该异常 2：在当前方法上继续使用throws声明异常的抛出
		 * 
		 * 根据实际的情况选择方法 不要在main方法上写throws
		 */
		Person p = new Person();
		try {
			
			p.setAge(10000);
			System.out.println(p.getAge());
		} catch (IllegalAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("出错了 ，小老弟！");
		}
		System.out.println(p.getAge());
	}
}
