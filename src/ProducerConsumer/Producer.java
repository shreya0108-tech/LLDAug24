package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Queue<Object> queue;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    int maxsize;
    public Producer(Queue<Object> q, int maxsize, Semaphore producerSemaphore, Semaphore consumerSemaphore)
    {
        this.queue = q;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.maxsize = maxsize;
    }
    @Override
    public void run() {
//        while(true)
//        {
//            synchronized(queue) {
//                if (queue.size() < 3) {
//                    System.out.println(Thread.currentThread().getName() + " is adding. " +
//                            queue.size());
//                    queue.add(new Object());
//                }
//            }
//        }
        while(true)
        {
            producerSemaphore.acquireUninterruptibly();
//            if(queue.size() < maxsize)
//            {
            System.out.println(Thread.currentThread().getName() + " is adding. " +
                            queue.size());
                queue.add(new Object());
            //}
            consumerSemaphore.release();
        }
    }
}
