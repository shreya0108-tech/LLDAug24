//Find the frequency of each character in a string using Java 8 streams

package streams_practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class frequencyOfElements {
    public static void main(String[] args) {
        List<Integer> l = List.of(2,4,6,3,5,9,8,7,1,2,3,6,7,1,0,1,7,5,3);
        Map<Integer, Long> map = l.stream().collect(groupingBy(Function.identity(),counting()));
        System.out.println(map);

        //similarly we can do for a list of string as well
    }
}
