package ex03;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구매하실 물건의 가격은?:");
        int price = sc.nextInt();
        if (price >= 20000) {
            System.out.println("배송비 무료입니다");
        } else {
            System.out.println("배송비 3000원입니다.");


        }


    }

}
