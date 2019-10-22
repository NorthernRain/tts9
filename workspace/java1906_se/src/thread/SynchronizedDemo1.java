package thread;

/**
 * 同步块 有效地缩小同步范围可以保证并发安全的前提下尽可能地提高并发效率
 * 
 * synchronized（同步监视器对象）{ 需要多线程同步运行的代码片段 } 同步块可以更加准确地锁定需要同步运行的代码片段，从而有效控制同步范围。
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo1 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Thread t = new Thread() {

			public void run() {
				
				shop.buy();
				
			}
		};

		Thread t1 = new Thread() {

			public void run() {
				
				shop.buy();
				
			}
		};
		t.start();
		t1.start();
	}
}

class Shop {
/*
 * 若在方法上直接使用synchronized.那么同步监视器对象就是当前方法所属对象this.
 */
	public void buy() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ":正在挑选衣服！");
			Thread.sleep(20);
			/*
			 * 使用同步块需要注意，多个需要同步运行的代码片段的线程看到的同步监视器对象，
			 * 即上锁的对象必须是同一个才可以。否则没有同步效果。
			 *
			 */
			
			
		/*	synchronized (new Object()) {
				System.out.println(t.getName() + ":正在试衣服！");
				Thread.sleep(20);
				System.out.println(t.getName() + ":试完衣服！");
			}*/
			
			
			synchronized (this) {
				System.out.println(t.getName() + ":正在试衣服！");
				Thread.sleep(20);
				System.out.println(t.getName() + ":试完衣服！");
			}

			System.out.println(t.getName() + ":结账离开！");
		} catch (Exception e) {

		}

	}

}