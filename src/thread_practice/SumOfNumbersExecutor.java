package thread_practice;

import javax.sound.midi.Soundbank;
import java.util.concurrent.*;

public class SumOfNumbersExecutor {
    static int sum = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e = Executors.newFixedThreadPool(10);
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                for(int i=1;i<=50;i++)
                {
                    System.out.println(i+" "+Thread.currentThread().getName());
                    sum+=i;
                }
                return sum;
            }
        };
        Future<Integer> f = e.submit(call);
        sum = f.get();
        System.out.println(sum);
    }
}
