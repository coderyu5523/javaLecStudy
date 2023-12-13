package ex01;

public class CsetEx01 {

    public static void main(String[] args) {

        int n1 = 1;
        double d1 = 1.5;
        
        d1 = n1;  //
        System.out.println(d1);  // 2가 아니라 2.0 이 출력됨. 값이 바뀌진 않지만 형이 변환됨.


    }
}
