package ex04.test01;

public class ScopeEx02 {
    int n1 = 1;
    static int n2 = 2;  // static 은 메모리 많이 먹음

    static void m1() {

        int n5 = 10;  // 이거는 stack 에 저장되기 때문에 메모리 아주 약간 먹음
        System.out.println("m1:" + n5);
        // n5 는 같은 메소드 내에서만 찾을 수 있음.
        // return  이 있으면 다시 23번 라인으로 가서 실행을 한번더 함.
    }

    void m2() {  // 실행되면 큐 생성, m2 stack 생성
        System.out.println("m2:" + n1);  // m2가 n1 을 찾을땐 heap 영역에서 찾음. heap 과 static은 떠있기만 하면 모든 영역에서 찾을 수 있음.

    }


    public static void main(String[] args) {
        System.out.println(1); // 메인 실행되는 순간 queue 실행 메인 stack 생성 ,pop 되고 사라짐
        m1(); // 메서드 m1 실행되는순간 , m1 queue 생성되고 실행됨. stack 공간에 pop 생김. 9라인 pop
        System.out.println(2); //
        ScopeEx01 sc = new ScopeEx01();  // pop 하는 순간 ScopeEx01 공간의 static 아닌 모든 자료가 뜸. 변수 n1, 메서드 m2 , sc 변수는 메인 stack 에  값이 아니라 주수로 저장됨. sc는 참조변수
        System.out.println(sc.n1);  //heap 에 있는 sc의 주소값 n1=1 을 출ㄺ
        sc.m2(); // m2 실행
        // stack 이 사라질 때 값을 유지하고 싶다면 return 으로 값을 받아야됨.
    }
}
