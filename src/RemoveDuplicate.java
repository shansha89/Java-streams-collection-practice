package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,4,5);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("After remove duplicates");
        System.out.println(result);
    }
}
