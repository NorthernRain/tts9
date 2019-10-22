package thread;

/**
 * 静态方法若是使用Synchronized 修饰后,那么该方法一定具有同步效果.
 * 
 * 静态方法的同步监视器对象使用的是当前类的类对象(class的实例) 类对象后面反射的课程中会介绍.
 * 
 * @author tarena
 *
 */
public class SynchronizedDemo2 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {

			public void run() {
				Boo.doSome();
			}
		};
		Thread t2 = new Thread() {

			public void run() {
				Boo.doSome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo {
	public synchronized static void doSome() {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ":正在执行doSome");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		System.out.println(t.getName() + ":运行完毕"); 

	}
	
/*public static void doSome() {
	 synchronized (Boo.class){
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ":正在执行doSome");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		System.out.println(t.getName() + ":运行完毕");
	 }
	}*/
}
