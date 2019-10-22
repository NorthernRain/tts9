package thread;

/**
 * 线程提供了一个静态方法： static Thread currentThread() 该方法可以获取运行这个方法的线程
 * 
 * 实际上java 的所有代码都是靠线程运行的， main方法也不例外。运行main方法的线程并不是有我们创建
 * ，而是jvm自行创建的，并用来运行main方法。 而我们通常称这个线程为"主线程"。
 * 
 * @author tarena
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println(main);
		Thread t1 = new Thread() {
			public void run() {
				doSome();
			}
		};
		t1.start();
	}

	public static void doSome() {
		Thread t = Thread.currentThread();
		System.out.println("doSome" + t);
	}
}
