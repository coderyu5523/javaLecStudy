package ex02;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하시오 :");
        int sec = sc.nextInt();

        int distance = sec * 340;
        System.out.println("번개가 발생한 곳 까지의 거리 :" + distance + "m");

    }

}
