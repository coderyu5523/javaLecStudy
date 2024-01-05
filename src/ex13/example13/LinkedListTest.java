package ex13.example13;

import java.util.LinkedList;

public class LinkedListTest<S> {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("milk");
        list.add("bread");
        list.add("butter");
        list.add(1, "apple");
        list.add(2, "grape");
        list.remove(3);

        System.out.println(list);


    }
}
