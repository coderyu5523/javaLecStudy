package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하세요 :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            fact = i * fact;
        }
        System.out.println(fact);
    }

}
