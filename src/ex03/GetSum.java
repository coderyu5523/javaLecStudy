package ex03;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {

            System.out.print("정수를 입력하세요 :");
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            sum = sum + n;
        }
        System.out.println("합계:" + sum);
    }
}
