package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java IO的标准输入与输出 使用 java IO 我们可以对外界设备以相同的方式进行读写 完成交换数据
 * 
 * java IO 将读写按照方向进行划分： 输入：从外界到程序的方向，用于让程序获取外界数据 因此输入时读数据的操作
 * 
 * 输出：从程序到外界的方向 ，用于数据写的操作
 * 
 * java IO以流的形式表示读写功能 java.IO.InputStream 输入流，通过输入流我们可以连接上外接设备从而读取设备数据
 * 
 * java.io.OutputStream 输出流 以上两个流失所有字节输入输出流的超类，规定了所有输入输出流的基本读写功能。
 * 
 * java 将流分为两大类：节点流与处理流
 * 
 * 节点流：又称为"低级流"，是真实连接程序与数据源的"管道" ，用于实际搬运数据的流.读写一定是建立在节点流的基础上的.
 * 
 * 处理流:又称为"高级流",高级流不能独立存在,必须连接在其他流上,目的是当数据流经当前流失对其做某些加工处理,简化我们读写数据时的相应操作.
 * 
 * 
 * 实际使用IO时,我们通常会串联若干的高级流最终连接到低级流上,使得读写数据以流水线式的加工处理完成,这个操作成为"流的连接",也是IO的精髓所在.
 * 
 * 文件流 文件流是一对低级流,作用是连接到文件上,用于读写文件数据. java.io.FileInputStream:文件输入流
 * java.io.FileOnputStream:文件输出流
 * 
 * 
 * 
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {

		/**
		 * 文件流提供的构造方法： FileOutputStream(File file) FileOutputStream(String path)
		 * 以上两种创建方式，默认为覆盖写模式，即： 若指定额文件已经存在，那么僵该文件原有的数据删除后，然后再讲新数据写入文件。
		 * 
		 * FileOutputStream(File file,boolean append) FileOutputStream(String
		 * path,boolean append)
		 * 以上两种构造器允许传入一个boolean值类型的参数，如果该值为true，文件输出流就是追加写模式
		 * 即：数据中原有数据保留，新内容会被追加到文件末尾
		 * 
		 * 
		 * 
		 * 文件流与RAF的区别： RAF是基于指针的随机读写形式，可以对文件任意位置进行读写，可以做到文件的部分数据覆盖等，读写更加灵活。
		 * 
		 * 文件流是基于java IO 的读写标准，而IO是顺序读写模式，即：只能向后读写，不能回退
		 * 
		 * 
		 * 单从读写灵活度来讲RAF是优于文件流的，但是文件流可以基于java IO的流连接完成一个复杂数据的读写，这是RAF不容易做到的。
		 *
		 */
		FileOutputStream fos = new FileOutputStream("./fos.txt");
		String line = "回手掏";
		fos.write(line.getBytes("UTF-8"));
		fos.write("走位走位，打不着！".getBytes("UTF-8"));

		fos.close();
	}
}
