package streamsAndlambdas;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,6,5,9,5,3,7,0);
        Stream<Integer> s = list.stream();
        //Anonymous class
        /*Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                if(o%2 != 0)
                    return true;
                return false;
            }
        };*/
        //Lambda exp
        Predicate<Integer> p = (o) -> (o%2 != 0);

        List<Integer> list1 = s.filter(p).collect(Collectors.toList());

        //or directly do :
        //List<Integer> list2 = s.filter((o) -> (o%2 != 0)).collect(Collectors.toList());
        System.out.println(list1);

        /*odd numbers square*/
        Stream<Integer> s2 = list.stream();
        List<Integer> l2 = s2.filter(p).map((x) -> (x*x)).toList();
        System.out.println(l2);

        //sort
        Stream<Integer> s3 = list.stream();
        List<Integer> l3 = s3.filter(p).map((x) -> (x*x)).sorted().toList();
        System.out.println(l3);

        //finding the first element
        Stream<Integer> s4 = list.stream();
        Optional<Integer> ele = s4.filter(p).map((x)->(x*x)).findFirst();     //returns
        //optional as the stream may be empty after filtering or inputted empty
        if(ele.isPresent())
            System.out.println(ele.get());

        //use the allMatch method to confirm if all numbers in the stream are even
        Stream<Integer> s5 = list.stream();
        boolean b = s5.allMatch((x) -> x%2 != 0);     //returns
        //optional as the stream may be empty after filtering or inputted empty
        System.out.println(b);

        //List<Integer> pq = new PriorityQueue<>();
    }
}
