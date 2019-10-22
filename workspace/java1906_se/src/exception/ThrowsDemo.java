package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 子类重写父类含有throws声明抛出的方法时，对throws的重写规则
 * 
 * @author tarena
 *
 */
public class ThrowsDemo {

	public void doSome() throws IOException, AWTException {

	}

}

class Some extends ThrowsDemo {
	/*
	 * 可以全部抛出
	 */
	/*
	 * public void dosom() throws IOException,AWTException{
	 * 
	 * }
	 */

	/*
	 * 可以只抛出其中一个
	 */
	/*
	 * public void doSome() throws AWTException {
	 * 
	 * }
	 */

	/*
	 * 可以一个都不抛
	 */
	/*
	 * public void doSome() {
	 * 
	 * }
	 */

	/*
	 * 可以抛出父类方法异常的子类异常
	 */
	/*
	 * public void doSome() throws FileNotFoundException {
	 * 
	 * }
	 */

	/**
	 * 超类方法没有的异常，也不存在继承关系的异常，是不能在子类抛出的。 不可以抛超类抛出的异常的父类异常
	 * 
	 */

}