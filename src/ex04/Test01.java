package ex04;


class A {
    private int a; // 전용
    int b;          // 디폴트
    public int c; // 공용


}


public class Test01 {
    public static void main(String[] args) {

        A obj = new A();


        obj.b = 20;
        obj.c = 30;


    }
}
