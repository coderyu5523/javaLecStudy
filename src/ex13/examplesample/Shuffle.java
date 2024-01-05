package ex13.examplesample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
