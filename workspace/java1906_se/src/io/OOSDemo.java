package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 对象流 java.io.ObjectOutputStream java.io.ObjectInputStream
 * 
 * 对象流是一对高级流, 在连接中的作用是方便读写 java对象.(对象与字节的转换由对象流完成)
 * 
 * @author tarena
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将一个person实例写入文件person.obj中
		 */
		String name = "中野三玖";
		int age = 16;
		String gender = "女";
		String[] otherInfo = { "五胞胎", "排行老三", "卡哇伊", "白富美", "大胸萝莉" };
		Person p = new Person(name, age, gender, otherInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * 该方法可能抛出：NotSerializableException 当写出的对象所属的类没有实现Serializable接口时就会抛出该异常
		 * 
		 * 写出文件发现该文件的实际数据量比当前对象的保存内容要大，这是因为这组字节除了保存 该对象的数据外还有这个对象的结构信息
		 */

		oos.writeObject(p);
		oos.close();

	}
}
