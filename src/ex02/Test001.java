package ex02;

import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) {

        int orange, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하십시오 :");
        orange = sc.nextInt();

        x = orange / 10;
        y = orange % 10;
        System.out.println(x + "개의 박스가 필요하고" + y + "개가 남습니다");

    }

}
