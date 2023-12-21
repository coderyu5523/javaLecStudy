package ex03.test;

import java.util.Random;

// Lotto01 을 반복문으로 만듬
// 이제 중복확인을 해야됨

public class Lotto02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < 6; i++) {

            num = r.nextInt(45) + 1;
            arr[i] = num;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);

        }
    }
}
