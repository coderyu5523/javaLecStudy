package ex13.example13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector vc = new Vector();

        vc.add("hello");
        vc.add(10);
        vc.add("hi");

        System.out.println("vector size:" + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element" + i + ":" + vc.get(i));
        }
        String s = (String) vc.get(0);
        System.out.println(vc.get(0));
    }
}
