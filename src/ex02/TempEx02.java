package ex02;

import java.util.Scanner;

public class TempEx02 {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("1.화씨->섭씨");
        System.out.println("2.섭씨->화씨");
        System.out.println("==================");
        System.out.println();
        System.out.print("번호를 선택하시오 :");
        Scanner sc = new Scanner(System.in);
        double temp, result;
        int selectNum;

        selectNum = sc.nextInt();

        System.out.println("온도를 입력하시오");
        temp = sc.nextDouble();

        result = (selectNum == 1) ? 5.0 / (9.0 * (temp - 32) : 9.0) / (5.0 * temp + 32);
        System.out.println("온도 : " + result);
    }

}
