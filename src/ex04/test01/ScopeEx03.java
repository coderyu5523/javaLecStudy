package ex04.test01;

public class ScopeEx03 {

    void m1() {
        int n1 = 1;
        System.out.println(n1);
    }

    static void m2() {
        int n2 = 2;
        System.out.println(n2);
    }

    int m3(int n3, int n4) {

        return n3 + n4;
    }


    public static void main(String[] args) {
        ScopeEx03 Sc = new ScopeEx03();
        Sc.m1();
        m2();
        int result = Sc.m3(1, 4);
        System.out.println(result);
    }
}
