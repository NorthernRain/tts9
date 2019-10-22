package thread;

/**
 * 线程提供了一个静态方法
 * 
 *
 * static void sleep(long ms) 该方法可以让运行这个方法的线程处于阻塞状态指定的毫秒，超时后线程会自动回到RUNNABLE状态
 * 再次并发运行
 * 
 * @author tarena
 *
 */
public class SleepDemo {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end =System.currentTimeMillis();
		System.out.println((end-start));
	}
}
