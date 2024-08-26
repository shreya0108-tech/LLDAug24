package numbersFrom1to100;

public class NumberPrinter implements Runnable{

    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
            System.out.println(number + " printed by "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
