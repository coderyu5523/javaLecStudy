package ex02;

import java.util.Scanner;

public class FtoC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f, c;
        System.out.print("화씨 온도를 입력하세요 :");
        f = sc.nextDouble();

        c = 5.0 / 9.0 * (f - 32);
        System.out.println(c);

    }


}
