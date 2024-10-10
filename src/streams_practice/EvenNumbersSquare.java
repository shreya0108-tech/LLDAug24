package streams_practice;

import java.util.List;
import java.util.stream.Collectors;

//Write code to return the sum of square of even elements in a List using Streams API
public class EvenNumbersSquare {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,7,1,3,7,8,9,5,6,4);
        list.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);
    }
}
