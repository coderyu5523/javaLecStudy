package ex13.examplesample;


import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("milk");
        set.add("bread");
        set.add("butter");
        set.add("cheese");
        set.add("ham");
        set.add("butter");

        System.out.println("집합의 수:" + set.size());
        System.out.println(set);


    }
}
