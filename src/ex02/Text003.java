package ex02;

import java.util.Scanner;

public class Text003 {
    public static void main(String[] args) {

        double avg;
        int x, y, sum, min, multi, maxValue, minValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("x :");
        x = sc.nextInt();
        System.out.print("y :");
        y = sc.nextInt();
        sum = x + y;
        min = x - y;
        multi = x * y;
        avg = (x + y) / 2;
        System.out.println("두 수의 합 :" + sum);
        System.out.println("두 수의 차 :" + min);
        System.out.println(("두 수의 곱 :" + multi));
        System.out.println("두 수의 평균 :" + avg);
        System.out.println("큰수 :");
        maxValue = (x > y) ? x : y;
        minValue = (y < x) ? y : x;
        System.out.println("큰 수 : " + maxValue);
        System.out.println("작은 수 :" + minValue);


    }


}

