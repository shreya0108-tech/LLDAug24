package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*try {
            int c = a / b;
            System.out.println(c);
            System.out.println("Shreya");
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
        System.out.println("Shreya 2");*/
        try
        {
            int d = division(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by 0");
        }

    }
    public static int division(int a, int b) throws ArithmeticException {
//        if(b == 0)
//            throw new ArithmeticException("Division by zero");
        return a/b;
    }
}
