package ex13.examplesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);

        }
        System.out.println("큐의 요소" + q);

        System.out.println("삭제된 요소:" + q.remove());
        System.out.println(q);
        System.out.println("삭제된 요소:" + q.remove());
        System.out.println(q);

    }
}
