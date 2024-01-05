package ex13.examplesample;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(100);
        p.add(50);
        p.add(30);
        p.add(60);
        System.out.println(p);

        System.out.println("삭제된 값:" + p.remove());
        System.out.println(p);


    }
}
