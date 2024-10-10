package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedQueue<Object>();
        int maxsize = 3;
        Semaphore producerSemaphore = new Semaphore(maxsize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Consumer c1 = new Consumer(queue,maxsize,producerSemaphore,consumerSemaphore);
        Consumer c2 = new Consumer(queue,maxsize,producerSemaphore,consumerSemaphore);
        Consumer c3 = new Consumer(queue,maxsize,producerSemaphore,consumerSemaphore);

        Producer p1 = new Producer(queue,maxsize,producerSemaphore,consumerSemaphore);
        Producer p2 = new Producer(queue,maxsize,producerSemaphore,consumerSemaphore);
        Producer p3 = new Producer(queue,maxsize,producerSemaphore,consumerSemaphore);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(p1);
        Thread t5 = new Thread(p2);
        Thread t6 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
