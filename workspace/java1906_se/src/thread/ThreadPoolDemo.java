package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池：
 * 线程池是管理线程的一套解决方案，主要作用：
 * 1：控制线程数量：
 * 线程数量过多会导致过多的资源消耗，并且会导致CPU
 * 过度切换降低整体并发性能。
 * <p>
 * 2：重用线程
 * 线程不应当随着任务的生命周期一致，频繁的创建和销毁线程也会给系统带来额外的开销。
 *
 * @author LeafDust
 * @create 2019-08-20 17:25
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread thread = Thread.currentThread();
                        System.out.println("指派了一个任务：");
                        System.out.println(thread.getName() + "正在执行...");
                        Thread.sleep(5000);
                        System.out.println(thread.getName() + ":任务执行完毕！");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            threadPool.execute(runnable);
        }

        threadPool.shutdown();

    }
}
