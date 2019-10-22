package thread;
/**
 * 多线程
 * 多线程改变了代码的执行方式，从原有的所有代码都串行操作改变为多个代码片段之间并行操作。
 * 因此多线程允许多个代码片段"同时运行"。
 * 
 * 
 * 创建线程的方式有两种
 * 1：继承线程并重写run方法，在run方法中定义线程要执行的任务。
 * 
 * 2：
 * 
 * 
 * @author tarena
 *
 */
public class ThredDemo1 {

	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		MyThread2 thread2=new MyThread2();
		/*
		 * 启动线程是调用线程的start方法  而不是直接调用run方法。
		 * 当线程的start方法调用后，线程纳入到线程调度中，当其第一次分配到时间片开始运行时
		 * ，他的run方法就会自动被执行。
		 */
		
		thread1.start();
		thread2.start();
		
	}
	
}

/**
 * 第一种创建线程的方式优点是创建简单方便
 * 缺点是：
 * 1：
 * 由于java是单继承的，这导致线程就无法继承其他的类，这会导致无法重用其他的超类的方法而产生
 * 继承冲突问题。
 * 
 * 
 * 2：定义线程的同时重写run方法，这就等于规定了线程要执行的任务，导致线程与执行的任务
 * 产生必然的耦合关系，不利于线程重用。
 * @author tarena
 *
 */
class MyThread1 extends Thread{
	
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			System.out.println("___________________");
		}
	}
	
	
}

class MyThread2 extends Thread{
	
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			System.out.println(">>>>>>>>>>>>>>>");
		}
	}
	
	
}