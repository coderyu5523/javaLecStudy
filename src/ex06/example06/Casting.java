package ex06.example06;

class Parent {
    void print() {
        System.out.println("parent 메서드 호출");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("child 메서드 호출");
    }
}

public class Casting {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.print();

    }
}
