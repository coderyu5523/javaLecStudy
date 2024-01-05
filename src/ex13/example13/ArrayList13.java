package ex13.example13;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("milk");
        list.add("bread");
        list.add("butter");
        System.out.println(list);

        list.add(1, "apple");
        System.out.println(list);

        list.set(2, "grape");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        String s = list.get(1);
        System.out.println(s);

        if (list.contains("apple")) {
            System.out.println("apple가 리스트에서 발견되었습니다.");
        }
    }
}
