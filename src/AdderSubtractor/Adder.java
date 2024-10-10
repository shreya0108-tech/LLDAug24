package AdderSubtractor;

public class Adder implements Runnable{
    Count count;
    public Adder(Count value)
    {
        this.count = value;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            count.value+=i;
        }
    }
}
