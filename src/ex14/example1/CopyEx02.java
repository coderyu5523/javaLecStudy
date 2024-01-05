package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> newList = list.stream().map((i) -> i * 100).toList();  //  stream 은 흩뿌림, map 은 가공   toList 는 수집

        //foreach

        newList.stream().forEach(i -> System.out.println(i));

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        for (Integer i : newList) {
            System.out.println(i);
        }

    }
}
