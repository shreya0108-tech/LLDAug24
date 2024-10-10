package AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;
    public Adder(Count value, Lock lock)
    {
        this.count = value;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
           // lock.lock();
            synchronized (Count.class) {
                count.value += i;
            }
            //lock.unlock();
        }
    }
}
