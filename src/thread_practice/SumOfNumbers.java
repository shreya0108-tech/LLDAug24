package thread_practice;

// Give sum of all numbers from 1 to 50 using 5 Threads, One Thread will sum only 10 Numbers,
// ex-> 1-10,11-20.....

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SumOfNumbers {
    static int sum = 0;
    public static void main(String[] args) throws InterruptedException {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                {
                    sum += i;
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=11;i<=20;i++)
                {
                    sum += i;
                }
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for(int i=21;i<=30;i++)
                {
                    sum += i;
                }
            }
        };
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                for(int i=31;i<=40;i++)
                {
                    sum += i;
                }
            }
        };
        Runnable r5 = new Runnable() {
            @Override
            public void run() {
                for(int i=41;i<=50;i++)
                {
                    sum += i;
                }
            }
        };
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);

        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println(sum);
    }
}
