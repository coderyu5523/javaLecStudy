package ex13.examplesample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerchTest {
    public static void main(String[] args) {
        int num = 11;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("타겟값:" + num);
        int index = Collections.binarySearch(list, num);
        System.out.println("타겟의 위치: " + index);

    }
}
