package ex02;

import java.util.Scanner;

public class TemperEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.화씨 -> 섭씨");
        System.out.println("2.섭씨 -> 화씨");
        double n, x, y;
        n = sc.nextInt();


        if (n == 1) {
            System.out.print(("화씨 온도를 입력하세요 :"));
            x = sc.nextInt();
            y = (x - 32) * 5 / 9;
            System.out.println("섭씨 온도는" + y + "도 입니다");
        } else if (n == 2) {
            System.out.print(("섭씨 온도를 입력하세요 :"));
            x = sc.nextInt();
            y = x * 9 / 5 + 32;
            System.out.println("화씨 온도는" + y + "도 입니다");

        }

    }

}
