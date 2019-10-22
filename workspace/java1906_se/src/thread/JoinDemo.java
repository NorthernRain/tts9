package thread;

/**
 * join方法允许当前线程在join方法所属线程上等待， 直到该线程结束后结束join阻塞继续后续操作。 所以join方法可以协调线程的同步运行。
 * 
 * 同步运行：多个线程之间执行有顺序。 异步运行：多个线程之间各执行各的。
 * 
 * 
 * 
 * @author tarena
 *
 */
public class JoinDemo {
	private static boolean isDownload = false;

	public static void main(String[] args) {
		/*
		 * 当一个方法的局部内部类中引用了这个方法的其他局部变量时，该变量必须声明为final的。
		 * 
		 * JDK8后可以不写final。但是该变量依然会被编译器最终改为final的。这源自于jvm的内存分配问题。
		 */
		// boolean isDownload = false;
		
	
		Thread download = new Thread() {

			public void run() {
				System.out.println("down：开始下载图片！");
				for (int i = 0; i < 100; i++) {
					System.out.println("down：" + i + "%");
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {

					} catch (Exception e) {

					}
				}
				isDownload = true;

				System.out.println("down:下载完毕！");
			}
		};

		Thread show = new Thread() {
			public void run() {
				try {

					System.out.println("show:开始显示文字！");
					Thread.sleep(3000);
					System.out.println("show:文字显示完毕！");

					/*
					 * 先等待download线程执行完毕(图片下载完毕) 之后再继续工作
					 */
					download.join();
					System.out.println("show:开始显示图片！");
					if (!isDownload) {
						throw new RuntimeException("图片加载失败！");
					}
					System.out.println("show:图片显示完毕！");
				} catch (Exception e) {

					e.printStackTrace();
				}

			};

		};

		download.start();
		show.start();
	}
	

}
