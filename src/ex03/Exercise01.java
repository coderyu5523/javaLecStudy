package ex03;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.print("값을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int inNum = sc.nextInt();

        if (inNum == 1) {
            System.out.println("ONE");
        } else if (inNum == 2) {
            System.out.println("TWO");
        } else if (inNum == 3) {
            System.out.println("THREE");
        } else if (inNum == 4) {
            System.out.println("FOUR");
        } else if (inNum == 5) {
            System.out.println("FIVE");
        } else if (inNum == 6) {
            System.out.println("SIX");
        } else if (inNum == 7) {
            System.out.println("SEVEN");
        } else if (inNum == 8) {
            System.out.println("EIGHT");
        } else if (inNum == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }

    }
}

