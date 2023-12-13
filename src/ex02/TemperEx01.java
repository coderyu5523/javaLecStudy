package ex02;

import java.util.Scanner;

public class TemperEx01 {
    public static void main(String[] args) {

        double cho, ins, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("1.화씨 -> 섭씨");
        System.out.println("2.섭씨 -> 화씨");
        System.out.println("==============");

        cho = sc.nextDouble();

        // 1.  온도받기
        if (cho == 1) {
            System.out.print(("화씨 온도를 입력하세요 :"));
            ins = sc.nextDouble();
            temp = (ins - 32) * 5.0 / 9.0;  // 5/9 는 int / int 기 때문에 소수점이 없어짐, 5/ 9.0을 하게 되면
            System.out.println("섭씨 온도는" + temp + "도 입니다");
        } else if (cho == 2) {
            System.out.print(("섭씨 온도를 입력하세요 :"));
            ins = sc.nextDouble();
            temp = ins * 9.0 / 5.0 + 32;
            System.out.println("화씨 온도는" + temp + "도 입니다");

        }

    }

}
