package ex13.example13;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("milk");
        set.add("bread");
        set.add("butter");
        set.add("cheese");
        set.add("ham");
        set.add("ham");

        System.out.println(set);

        if (set.contains("ham")) {
            System.out.println("ham 포함되어있음");
        }


    }
}
