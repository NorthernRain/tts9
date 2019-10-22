package thread;

/**
 * 
 * sleep方法要去处理中断异常 当一个线程调用sleep方法处于阻塞状态的过程中，此时被其他线程调用了
 * 该线程的interrupt方法那么就会打断这个线程的睡眠阻塞，此时sleep方法就会抛出中断异常告知。
 * 
 * @author tarena
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				System.out.println("林：刚美容完，睡个觉！");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("林：起床了！起床了！墙塌了！");
				}

				catch (Exception e) {

				}
				System.out.println("林：醒醒你没有女朋友！");
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				System.out.println("黄：开始砸墙！");
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("黄：80!");

					} catch (Exception e) {

					}
				}
				System.out.println("咣当！");
				System.out.println("黄：搞定！");
				t1.interrupt();
			}
		};

		t1.start();
		t2.start();

	}
}
