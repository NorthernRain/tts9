package thread;

/**
 * 互斥锁： 当使用synchronized锁定多个代码片段，并且制定的同步监视器对象时同一个时，
 * 这些代码时间就是互斥的，多个线程不能同时在这些代码片段之间一起执行。
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo3 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Foo foo1 = new Foo();
		Thread t1 = new Thread() {

			public void run() {
				foo.methordA();
				foo.methordB();
			}
		};
		Thread t2 = new Thread() {

			public void run() {
				foo.methordA();
				foo.methordB();
			}
		};
		t1.start();
		t2.start();

	}
}

class Foo {
	public synchronized void methordA() {

		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ":正在执行A方法！");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println(t.getName() + ":A运行完毕");
	}

	public synchronized void methordB() {

		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ":正在执行B方法！");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println(t.getName() + ":B运行完毕");
	}
}