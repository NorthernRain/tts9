package thread;

/**
 * 守护线程 守护线程也称为后台线程，创建和使用上与前台线程一样， 但还有一点不同： 当进程结束时，所有正在运行的守护线程会被强制停止。
 * 
 * 进程的结束：当所有普通线程都结束时，进程结束。
 * 
 * @author tarena
 *
 */
public class DaemonThreadDemo {

	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:Let me go!");

					try {
						Thread.sleep(1000);
					}

					catch (InterruptedException e) {
					} catch (Exception e) {
					}

				}
				System.out.println("rose:AAAAAAAAAAAAAAAAA.....噗通....");
			
			}

		};

		Thread jack = new Thread() {
			public void run() {
				while (true) {
					System.out.println("jack:You jump,i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					} catch (Exception e) {

					}
				}
			};

		};

		rose.start();
		jack.setDaemon(true);
		jack.start();
		/*
		 * while (true) {
		 * 
		 * }
		 */
	}

}