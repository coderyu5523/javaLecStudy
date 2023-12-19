package ex04;

public class MethodEx02 {
    static void m3(int n1) {  // 투입구에 값을 입력받을 수 있음
        System.out.println("m3:" + n1);
    }

    static void m4(int n1, int n2) {   // () 이 자리를 파라메터 자리라고함, 매개변수
        System.out.println("m4:" + n1);
        System.out.println("m4:" + n2);
    }


    public static void main(String[] args) {
        m3(1);
        m4(1, 2);  //arguments (동전) parameter (동전투입구) 메서드는 자판기
    }
}
