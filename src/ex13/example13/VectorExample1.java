package ex13.example13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();

        vec.add("APPLE");
        vec.add("ORANGE");
        vec.add("MANGO");

        System.out.println(vec.size());
        Collections.sort(vec);

        System.out.println(vec);

    }
}
