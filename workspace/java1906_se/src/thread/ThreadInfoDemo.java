package thread;

import org.omg.CosNaming.IstringHelper;

/**
 * 获取线程信息的相关方法
 * 
 * @author tarena
 *
 */
public class ThreadInfoDemo {

	public static void main(String[] args) {
		// 获取主线程
		Thread main = Thread.currentThread();
		// 获取名字
		String name = main.getName();
		System.out.println("main : " + name);
		// 获取唯一标识ID
		long ID = main.getId();
		System.out.println("ID : " + ID);
		// 优先级
		int priority = main.getPriority();
		System.out.println("优先级：" + priority);
		//
		boolean isAlive = main.isAlive();
		boolean isDaemon = main.isDaemon();
		boolean inInterrupted = main.isInterrupted();
		System.out.println("isAlive:" + isAlive);
		System.out.println("isDaemon:" + isDaemon);
		System.out.println("inInterrupted:" + inInterrupted);

	}

}
