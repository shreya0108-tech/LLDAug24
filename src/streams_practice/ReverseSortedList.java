package streams_practice;

import java.util.List;

public class ReverseSortedList {
    public static void main(String[] args) {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        randomNumbers.stream().sorted((x,y)->y-x).forEach(System.out::println);
    }
}