package ex02;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, sum;
        System.out.print("첫 번째 숫자를 입력하시오: ");
        x = sc.nextInt(); // 사용자가 입력한 값을 받을 수 있음.

        System.out.print("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println("두 수의 합 :" + sum);
    }
}
