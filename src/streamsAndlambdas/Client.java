package streamsAndlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Client {
    public static void main(String[] args) {
        //IntFunction<Integer> fun;
        /*We cannot create an instance of runnable class because it is an interface. Thus,
         * we'll have to provide the instance of any class implementing runnable interface*/
        // Runnable r = new .....
        // Thread thread = new Thread(r);

        //So options to use interfaces are :
        /*1. Create a class that implements the interface and provide the method body
         to all the methods of the interface.*/

        //2. anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        Thread t = new Thread(r);
        t.start();

        /*3. Lambdas - for functional interfaces only
        () -> input parameters
        {} -> method body / implementation
         */
        Runnable r2 = () -> {
            System.out.println("Hello World 2");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        //Comparator example
        Student s1 = new Student(1, "Shreya", 23, 98);
        Student s2 = new Student(2, "Sajal", 65, 10);
        Student s3 = new Student(3, "Satyam", 30, 3);
        Student s4 = new Student(4, "Somya", 26, 75);

        List<Student> st = new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        //anonymous class
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(st,c);
        System.out.println(st);         /*this line is printing the values of the
        list because we have overriden the toString() method in Student class, else
         it will show the address*/

        //lambda expression
        Comparator<Student> c2 = (o1,o2)->o2.getAge()-o1.getAge();
        Collections.sort(st,c2);
        System.out.println(st);         /*this line is printing the values of the
        list because we have overriden the toString() method in Student class, else
         it will show the address*/

        //list to array in one line
        Student[] stArr = st.stream().toArray(Student[]::new);
    }
}
