package ex13.examplesample;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("pear");

        System.out.println(list);

        list.add(1, "orange");
        list.set(0, "grape");
        list.remove(3);
        System.out.println(list);


    }
}
