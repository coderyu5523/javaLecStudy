package ex03;

public class GugudanEx01 {

    //1~9단까지 출력되는 프로그램을 만드세요
    // 스캐너를 이용하여 입락받은 단만 출력하시오.
    public static void main(String[] args) {

        for (int x = 2; x <= 9; x++) {
            for (int i = 1; i <= 9; i++)
                System.out.println(x + "*" + i + "=" + (x * i));
            System.out.println();

        }
    }


}
