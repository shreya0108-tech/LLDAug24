package streams_practice;

import java.util.List;

public class multipleOf5 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        randomNumbers.stream().map(x -> x*5).forEach(System.out::println);
    }
}
