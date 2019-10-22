package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * FileOutputStream
 * 输出流
 * @author tarena
 *
 */
public class FOSDemo {
public static void main(String[] args) throws UnsupportedEncodingException, IOException {
	FileOutputStream fos=new FileOutputStream("./fos.txt",true);
	fos.write("三玖天下第一".getBytes("UTF-8"));
	fos.close();
	
}
}
