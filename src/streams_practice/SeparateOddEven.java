//Separate odd and even numbers in a list of integers

package streams_practice;

import java.util.List;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> l = List.of(2,4,6,3,5,9,8,7,1);
        List<Integer> lEven = l.stream().filter(x->x%2==0).toList();
        List<Integer> lOdd = l.stream().filter(x->x%2!=0).toList();
        l.stream().filter(x->x%2==0).toList().forEach(System.out::println);
        System.out.println(lEven);
        System.out.println(lOdd);
    }
}
