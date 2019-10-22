package thread;

/**
 * 线程的优先级 线程启动后就纳入到了线程调度器中统一管理， 设么时候获取CPU时间片完全取决于线程调度。
 * 线程是不能主动索取的，通过调整线程的优先级可以最大程度干涉分配CPU时间片的几率。
 * 
 * 
 * 理论上线程优先级越高的线程获取CPU时间片的几率越高。
 * 
 * 
 * 线程的优先级有110个等级，用整数0-10表示，1最小，5默认，10最高。
 * 
 * @author tarena
 *
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("min");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("normal");
				}
			}
		};

		Thread t3 = new Thread() {
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("max");
				}
			}
		};

		t1.setPriority(Thread.MIN_PRIORITY);
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}
}
