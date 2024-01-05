package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class StreamEx01 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("park", "kim", "lee");
        List<String> s2 = list.stream().filter(s -> s.contains("p")).toList();
        System.out.println(s2);


    }

}

