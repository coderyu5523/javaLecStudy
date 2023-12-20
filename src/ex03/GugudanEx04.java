package ex03;

class GugudanUtil {  // 라이브러리
    static void gugudan(int x) { // 매개변수x 는 stack 에 저장됨. 구구단 메서드가 실행될 때 실행됨/
        for (int i = 1; i <= 9; i++)
            System.out.println(x + "*" + i + "=" + (x * i));
        System.out.println();
    }


}


public class GugudanEx04 {

    public static void main(String[] args) {
        //GugudanUil 클래서에 gugudan 정적 메서드를 호출하세요.
        // 파라미터는 int한개가 필요합니다.

        // 구구단을  출력해주는 메서드
        GugudanUtil.gugudan(12);

    }
}


