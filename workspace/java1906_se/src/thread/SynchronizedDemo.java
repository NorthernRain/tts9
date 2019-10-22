package thread;

/**
 * 多线程并发安全问题 当多个线程并发访问同意临界资源，由于线程切换时机不确定，导致多个线程操作该资源未按照
 * 程序设计的顺序进行导致出现错误，严重时可能出现系统瘫痪等情况。
 * 
 * 临界资源：同一时间只能被同一线程操作的资源。
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo {

	public static void main(String[] args) {
		Table table = new Table();
		Thread t = new Thread() {

			public  void run() {
				while (true) {
					Thread.yield();
					System.out.println(Thread.currentThread()+ ":" + table.getBeans());

				}
			}

		};

		Thread t1 = new Thread() {
			public void run() {
				while (true) {
					Thread.yield();
					System.out.println(Thread.currentThread() + ":" + table.getBeans());
				}
			}
		};

		t.start();
		t1.start();
	}

}


class Table {
	private int beans = 20;
/**
 * 
 * 当一个方法使用关键字synchroniaed修饰这个方法称为“同步方法”
 * 多个线程不能同时在方法内部执行
 * 将多个线程异步操作临界资源改为同步操作
 * 就可以解决多线程的并发安全问题了。
 * 
 */
	public synchronized int getBeans() {
		if (beans == 0) {
			throw new RuntimeException("豆子不够啦！");
		}
		Thread.yield();
		return beans--;

	}

}