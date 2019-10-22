package thread;

/**
 * 使用匿名内部类的创建形式完成线程的两种创建
 * 
 * @author tarena
 *
 */

public class ThreadDemo3 {

	public static void main(String[] args) {
		// 第一种创建方式
		Thread t1= new Thread(){
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					System.out.println(">>>>>>>>>>>>>");
				}
			}
		};
		
		//第二种创建方式
		Runnable r1=new Runnable(){;
		public void run() {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("*************");
			}
		}
		};
		Thread t2= new Thread(r1);
		
		t1.start();
		t2.start();
	}

}


