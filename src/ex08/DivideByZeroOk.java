package ex08;


import java.util.Scanner;

class divide1 {
    void divide(int num) throws Exception {
        System.out.println(10 / num);
    }
}

public class DivideByZeroOk {
    public static void main(String[] args) {
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            divide1 d1 = new divide1();
            try {
                d1.divide(num);
            } catch (Exception e) {
                System.out.println("0은 넣으면 안됨");
            }
        }
    }
}

