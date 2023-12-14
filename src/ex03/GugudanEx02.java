package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));

        }


    }


}
