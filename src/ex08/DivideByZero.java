package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int result = 0;
        try {
            result = 10 / num;
        } catch (Exception e) {  // Exception e = new ArithmeticExeption()

//            System.out.println("0으로 나누면 안되요");
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//
//            e.printStackTrace();  //이걸 넣으면 예외처리되도 오류결과를 볼 수 있음
            throw new RuntimeException("0으로 나눌 수 없어요");   // ctrl + alt + "t"  6번
        }
        System.out.println("나눗셈 결과 :" + result);

    }
}
