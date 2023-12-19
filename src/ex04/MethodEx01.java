package ex04;

public class MethodEx01 {

    static void m1() {              //기본 메서드 ,void 는 반환타입이 없다. m1는 메서드의 이름, 호출시 {} 부분이 실행됨
        System.out.println("m1");    //static 으로 메모리에 띄우면

    }

    static String m2() {              //  출력값 return이 있으면 자료형을 맞춰여한다.
        //
        return "m2";  // 리턴이 되는 순간 메서드 종료, 리턴은 제일 밑에 종료, 리턴은 여러개 출력못함.
    }

    public static void main(String[] args) {

        m1();  // static 은 같은 클래스에 있을때 클래스명 MethodEx01.m1 에서 MethodEx01 를 생략할 수 있음. m1()은 리턴값이 없어 바뀌지 않음.
        m2();  // 호출되는 순간 {}내부가 열리면서 실행됨. 일단 이해말고 외우자. 실행이 끝나면 return 값 m2 로 바뀜
        String reult = "m2"; // m2() 를 실행하면 이거랑 동일한 결과를 냄 , 메서드를 리턴하면 호출문이 리턴값이 됨
        String result = m2(); // String reult = "m2"; 같음

        System.out.println(result);
    }
}
