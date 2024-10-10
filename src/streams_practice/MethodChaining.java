package streams_practice;

import java.util.List;
import java.util.stream.Collectors;

//10. Given a list of words, find a list that contains the length
// of each word that starts with ‘b’ and return the list of size of those strings.
// e.g; list = {"apple", "banana", "berry", "orange", "litchi"}, output should be {6, 5}.
public class MethodChaining {
    public static void main(String[] args) {
        List<String> l = List.of("apple", "banana", "berry", "orange", "litchi");
        List<Integer> out = l.stream().filter(s->s.startsWith("b")).
                map(String::length).collect(Collectors.toList());
        System.out.println(out);
    }
}
