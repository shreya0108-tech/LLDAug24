package thread_practice;

import java.util.concurrent.Semaphore;

public class Print1to100Sequentially {
    public static void main(String[] args) throws InterruptedException {
        int maxSize = 100;
        Semaphore semaphoreEven = new Semaphore(0);
        Semaphore semaphoreOdd = new Semaphore(1);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= maxSize; i += 2) {
                    semaphoreOdd.acquireUninterruptibly();
                    System.out.println(Thread.currentThread().getName()+" "+i);
                    semaphoreEven.release();
                }
            }
        };
        Thread t = new Thread(r);

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= maxSize; i += 2) {
                    semaphoreEven.acquireUninterruptibly();
                    System.out.println(Thread.currentThread().getName()+" "+i);
                    semaphoreOdd.release();
                }
            }
        };
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        t.join();
        t2.join();
    }

}
