package exception;

/**
 * 多线程并发的安全问题 当多线程并发访问同一个临街资源时，由于线程的切换时机不确定，导致多个线程操作该资源
 * 未按照程序设计的顺序进行，导致出现错误，严重时可能出现系统瘫痪等情况。
 * 
 * 
 * 临界资源：同一时间只能被一条线程操作的资源。
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t = new Thread() {
			public void run() {
				while (true) {

					Thread.yield();
					System.out.println(getName() + ":" + table.getBeans());

				}
			};
		};
		Thread t1 = new Thread() {

			public void run() {
				while (true) {

					Thread.yield();
					System.out.println(getName() + ":" + table.getBeans());
	
				}
			}
		};
		t.start();
		t1.start();
	}

}

class Table {
	private byte beans = 10;

	public int getBeans() {
		if (beans == 0) {
			throw new RuntimeException("豆子不够啦！");

		}
		/**
		 * static void yield() 当一个线程执行到这个方法时会主动让出本次CPU时间片并回到Runable状态。
		 */
		Thread.yield();// 模拟CPU没有时间了。
		return beans--;
	}

}
