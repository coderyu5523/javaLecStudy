package ex02;

import java.util.Scanner;

public class CtoF2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f, c;
        System.out.print("섭씨 온도를 입력하세요 :");
        c = sc.nextDouble();

        f = 9.0 / 5.0 * c + 32;
        System.out.println(f);

    }


}
