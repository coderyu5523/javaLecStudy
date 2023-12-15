package ex03;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        double insN1 = sc.nextDouble();
        System.out.print("연산을 입력하세요:");
        char insC = sc.next().charAt(0);
        System.out.print("숫자를 입력하세요:");
        double insN2 = sc.nextDouble();


        if (insC == '+') {
            double sum = insN1 + insN2;
            System.out.println(insN1 + "+" + insN2 + "=" + sum);
        } else if (insC == '*') {
            double multi = insN1 * insN2;
            System.out.println(insN1 + "*" + insN2 + "=" + multi);
        } else if (insC == '-') {
            double minus = insN1 - insN2;
            System.out.println(insN1 + "-" + insN2 + "=" + minus);
        } else if (insC == '/' && insN2 != 0) {
            double divide = insN1 / insN2;
            System.out.println(insN1 + "/" + insN2 + "=" + divide);
        } else if (insC == '/' && insN2 == 0) {
            System.out.println("잘못 입력하셨습니다");


        }
    }
}
