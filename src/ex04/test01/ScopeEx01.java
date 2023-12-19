package ex04.test01;

public class ScopeEx01 {
    int n1 = 1;  // 힙에 저장
    static int n2 = 2; // static 에 저장

    static void m1() {    //         int n1 = 10 을 삭제하면    int n1 = 1; 이 안뜸
        // static은 메인시작 전에 뜨지만     int n1 = 1; 는 new 를 하지 않았기 때문에 사용되지 않음

        int n1 = 10; //  스택이라는 메모리 공간에 존재
        System.out.println("m1:" + n1);  // queue 크기 2 ;의 숫자 , 큐가 다 실행되면 큐는 종료되고 스택도 사라짐.
    }

    void m2() {
        System.out.println("m2:" + n1);  //

    }

    // 메인 시작 전 n2 변수와 m1 메서드가 메모리에 메모리에 로드 되어 있음.
    // m1 메서드의 {} 내의 값은 호출 전에는 떠있지 않는다. 호출하는 순간 내부가 실행됨.
    public static void main(String[] args) {  // 메인이 시작될때 큐가 실행, 그때 스택도 같이 만들어짐.큐는 라인이 들어가서 순서대로 라인이 실행. 스택은 큐가 실행될때 임시저장하려고 생김
        // n2 는 ScopeEx01.n2 에서 같은 클래스라 생략 . 클래스를 찾는법 클래스. xx, 객체를 찾는법 객체명.xx
        // static은 한번만 호출할 수 있음
        System.out.println(1);
        m1(); // m1 이 실행되는 순간 m1의 큐가 만들어지고, 스택도 같이 만들어짐. 그리고 실행완료되면 스택도 같이 사라짐. 스택은 먼저 들어온 메인 스택이 가장 나중에 종료됨.
        System.out.println(2);// 화면에 2를 출력하면 메인 스택 종료됨.
    }
}
