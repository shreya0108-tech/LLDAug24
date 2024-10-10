package streams_practice;

import java.util.List;

public class MinMaxFromList {
    public static void main(String[] args) {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        randomNumbers.stream().min(Integer::compareTo).ifPresent(System.out::println);
        randomNumbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
