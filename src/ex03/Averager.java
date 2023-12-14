package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        int grade;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("성적을 입력하세요:");
            grade = sc.nextInt();
            if (grade < 0) {
                break;
            }
            count++;
            total = total + grade;
        }
        System.out.println("평균은 :" + total / count);
    }


}
