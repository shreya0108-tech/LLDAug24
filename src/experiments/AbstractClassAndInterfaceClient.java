package experiments;

public class AbstractClassAndInterfaceClient extends DemoAbstractClass implements DemoInterface{
    public static void main(String[] args) {
        DemoInterface d = new AbstractClassAndInterfaceClient();
        d.bike();
        DemoAbstractClass d1 = new AbstractClassAndInterfaceClient();
        d1.car();
        d1.cycle();
    }

    @Override
    public void bike() {
        System.out.println("I am a bike");
    }

    @Override
    public void car() {
        System.out.println("I am a car");
    }
}
