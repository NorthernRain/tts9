package exception;

import java.io.FileOutputStream;

/**
 * JDK7之后推出了一个新特性：AutoClosable 该特性旨在让我们在源代码中可以以更简化的代码完成在finally中关闭流
 * 
 * @author tarena
 *
 */
public class AutoClosableDemo {
	public static void main(String[] args) {

		try (   /*
				 * 在这里定义的流最终会被编译器在finally中关闭， 只有实现了AuotoClosable接口的类才能在这里定义并被实例化
				 */
				FileOutputStream fos = new FileOutputStream("fos.txt");) {
			fos.write(1);

		} catch (Exception e) {
			System.out.println("出错了！");
		}
	}
}

 