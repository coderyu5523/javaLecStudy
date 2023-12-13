package ex02;

import java.util.Scanner;

public class test002 {

    public static void main(String[] args) {

        double mile, km;
        Scanner sc = new Scanner(System.in);
        System.out.print("마일을 입력하시오:");
        mile = sc.nextDouble();
        km = mile * 1.609;

        System.out.println(mile + "마일은" + km + "킬로미터 입니다.");


    }
}
