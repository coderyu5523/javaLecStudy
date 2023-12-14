package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {   //true를 넣으면 반복문이 무한반복
            System.out.print("정수를 입력하시오 :");
            int number = sc.nextInt();
            if (number == 99) {
                break;              //반복문을 나올 때 조건
            }
            if (number == 199) {    //반복문의 아래 조건을 생략하고 반복문의 처음으로 돌아감.
                continue;
            }

            if (number > 0) {
                System.out.println("양수입니다.");
            } else if (number < 0) {
                System.out.println("음수입니다.");
            } else {
                System.out.println("0입니다.");
            }

        }
    }
}
