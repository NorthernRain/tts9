package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象输出流
 * 
 * @author tarena
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		Person person = new Person("三玖", "女", 16, new String[] { "漂亮", "温柔" });
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
	}
}
