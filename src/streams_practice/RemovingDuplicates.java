//Remove duplicate elements from a list using Java 8 streams

package streams_practice;

import java.util.List;

public class RemovingDuplicates {
    public static void main(String[] args) {
        List<Integer> l = List.of(2,4,6,3,5,9,8,7,1,2,3,6,7,1);
        l.stream().distinct().forEach(System.out::println);
    }
}
