package ex01;

public class CsetEx01 {

    public static void main(String[] args) {

        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;
        d1 = n1;  // 묵시적 형변환 ,타입이 바뀌진 않음  ,업캐스팅 (자동으로 일어남)
        System.out.println(d1);  // 2가 아니라 2.0 이 출력됨. 값이 바뀌진 않지만 형이 변환됨.

        n1 = (int) d1; //다운캐스팅 (자동으로 되지 않고 강제로 변경해야됨)
        System.out.println(n1);
    }
}
