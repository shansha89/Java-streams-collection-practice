package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sam", "Ram", "Gam","Ram");

        Map<String, Integer> freq = new HashMap<>();

        for(String name : names){
            freq.put(name, freq.getOrDefault(name,0)+1);
        }
        System.out.println(freq);
    }

}
