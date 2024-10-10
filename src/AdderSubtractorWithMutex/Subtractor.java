package AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    public Subtractor(Count count, Lock lock)
    {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            //lock.lock();
            synchronized (Count.class) {
                count.value -= i;
            }
            //lock.unlock();
        }
    }
}
