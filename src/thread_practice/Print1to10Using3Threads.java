package thread_practice;

import java.util.concurrent.Semaphore;

// Write a java program to print a sequence of numbers upto 10 using 3 threads.
public class Print1to10Using3Threads {
    public static void main(String[] args) {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i+=3)
                {
                    s1.acquireUninterruptibly();
                    System.out.println(i);
                    s2.release();
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=2;i<=10;i+=3)
                {
                    s2.acquireUninterruptibly();
                    System.out.println(i);
                    s3.release();
                }
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for(int i=3;i<=10;i+=3)
                {
                    s3.acquireUninterruptibly();
                    System.out.println(i);
                    s1.release();
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
