package numbersFrom1to100;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientNumberPrinter {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        //without executor service
//        for(int i=1;i<=100;i++)
//        {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }
        //with executor framework
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++)
        {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
    }
}
