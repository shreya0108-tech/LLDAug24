package experiments;

import java.util.ArrayList;
import java.util.List;

public class CountWordswithaChar {
    public static void main(String[] args) {
        List<String> l = List.of("apple", "banana", "berry", "orange", "litchi");
        List<Integer> out = new ArrayList<>();
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).charAt(0) == 'b')
            {
                out.add(l.get(i).length());
            }
        }
        System.out.println(out);
    }
}
