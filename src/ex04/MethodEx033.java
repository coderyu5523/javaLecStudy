package ex04;

public class MethodEx033 {

    static void m1() {              //기본 메서드 ,void 는 반환타입이 없다. m1는 메서드의 이름, 호출시 {} 부분이 실행됨
        System.out.println("m1");    //static 으로 메모리에 띄우면

    }

    static String m2() {              //  출력값 return이 있으면 자료형을 맞춰여한다.
        System.out.println("m2");
        return "m2";  // 리턴이 되는 순간 메서드 종료, 리턴은 제일 밑에 종료, 리턴은 여러개 출력못함.
    }

    public static void main(String[] args) {

        m1();
        m2();
        String result1 = m2();

    }
}
