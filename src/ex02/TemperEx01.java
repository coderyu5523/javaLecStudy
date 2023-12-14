package ex02;

import java.util.Scanner;

public class TemperEx01 {
    public static void main(String[] args) {

        double temp, result;
        int selectNum;

        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("1.화씨 -> 섭씨");
        System.out.println("2.섭씨 -> 화씨");
        System.out.println("==============");
        System.out.println();
        System.out.print("번호를 선택하시오 :");
        selectNum = sc.nextInt();

        // 1.  온도받기
        if (selectNum == 1) {
            System.out.print(("화씨 온도를 입력하세요 :"));
            temp = sc.nextDouble();
            result = 5.0 / 9.0 * (temp - 32);
            System.out.println("섭씨 온도는" + result + "도 입니다");
        } else if (selectNum == 2) {
            System.out.print(("섭씨 온도를 입력하세요 :"));
            temp = sc.nextDouble();
            result = temp * 9.0 / 5.0 + 32;
            System.out.println("화씨 온도는" + result + "도 입니다");

        }

    }

}
