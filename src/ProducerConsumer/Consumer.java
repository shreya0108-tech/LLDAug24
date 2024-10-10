package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Queue<Object> queue;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    int maxsize;
    public Consumer(Queue<Object> queue, int maxsize, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.maxsize = maxsize;
    }
    @Override
    public void run() {
//        while(true)
//        {
//            synchronized(queue) {
//                if (queue.size() > 0) {
//                    System.out.println(Thread.currentThread().getName() + " is removing. " +
//                            queue.size());
//                    queue.remove();
//                }
//            }
//        }
        while(true){
            consumerSemaphore.acquireUninterruptibly();
            //if(queue.size() > 0){
            System.out.println(Thread.currentThread().getName() + " is removing. " +
                            queue.size());
                queue.poll();
            //}
            producerSemaphore.release();
        }
    }
}
