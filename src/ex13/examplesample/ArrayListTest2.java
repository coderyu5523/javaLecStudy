package ex13.examplesample;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("pear");

        System.out.println(list);
        int index1 = list.indexOf("mango");
        System.out.println("망고의 위치:" + index1);

        list.add(1, "grape");
        System.out.println(list);
        int index2 = list.indexOf("mango");
        System.out.println("망고의 위치:" + index2);
    }
}
