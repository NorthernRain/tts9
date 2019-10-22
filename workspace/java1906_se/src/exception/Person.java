package exception;

/**
 * 使用当前类测试一异常的抛出
 * 
 * @author tarena
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException {
		if (age < 0 || age > 100) {
			/*
			 * 当一个方法中使用throw抛出一个异常时就要在当前方法上使用throws声明该异常的抛出 告知调用者去解决该异常 注：
			 * 只有抛出RuntimeException及其子类型异常时可以不这样做
			 */
			throw new IllegalAgeException("年龄不合法！");
		}
		this.age = age;
	}

}
