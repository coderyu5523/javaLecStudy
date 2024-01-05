package ex13.examplesample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        String[] s = {"walk", "apple", "milk", "hello"};
        Integer[] in = {10, 5, 71, 15, 35};


        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        List<String> list1 = Arrays.asList(s);
        Collections.sort(list1);
        System.out.println(list1);


        System.out.println();
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.println();


        List<Integer> list2 = Arrays.asList(in);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
