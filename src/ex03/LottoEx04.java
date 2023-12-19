package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx04 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < 6; i++) {

            num = r.nextInt(45) + 1;
            arr[i] = num;


        }
        System.out.println(Arrays.toString(arr));

    }
}
