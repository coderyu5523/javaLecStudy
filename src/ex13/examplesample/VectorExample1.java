package ex13.examplesample;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();

        vec.add("apple");
        vec.add("orange");
        vec.add("mango");

        System.out.println(vec);
        System.out.println("벡터의 크기:" + vec.size());
        Collections.sort(vec);

        System.out.println(vec);


    }
}
