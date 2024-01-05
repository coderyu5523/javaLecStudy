package ex14.example1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("park", "kim", "lee");
        Stream<String> s2 = list.stream().sorted(Comparator.reverseOrder());
        s2.forEach(System.out::println);


    }

}

