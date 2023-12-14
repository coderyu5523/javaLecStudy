package ex03;

import java.util.Scanner;

public class RockPaperScissor {

    final int scissor = 1;
    final int rock = 2;
    final int paper = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1) 바위(2) 보(3) 을 입력하세요:");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        if (user == computer) {
            System.out.println("비겼습니다");
        } else if (user == 1 && computer == 3) {
            System.out.println("이겼습니다.");
        } else if (user == 2 && computer == 1) {
            System.out.println("이겼습니다.");
        } else if (user == 3 && computer == 2) {
            System.out.println("이겼습니다.");
        } else {
            System.out.println("졌습니다.");
        }
    }
}
