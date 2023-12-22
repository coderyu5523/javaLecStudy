package ex06;

class Base {
    public Base() {
        System.out.println("부모 생성자");
    }

    public Base(int x) {
        System.out.println("매개변수 있는 생성자");
    }

}

class Dervied extends Base {
    public Dervied() {
        super();
        System.out.println("자식 생성자");
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Dervied d = new Dervied();

    }
}
