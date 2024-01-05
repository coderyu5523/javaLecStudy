package ex13.example13;


import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("pear");
        list.add("grape");

        int index = list.indexOf("mango");
        System.out.println("망고의 위치:" + index);


    }
}
