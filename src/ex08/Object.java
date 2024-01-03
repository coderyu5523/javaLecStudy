package ex08;

abstract class object {
    public abstract void draw();
}

class Rectangle extends object {
    public void draw() {
        System.out.println("사각형");
    }
}

class Circle extends object {

    public void draw() {
        System.out.println("원");
    }
}

public class Object {
    public static void main(String[] args) {

        object c = new Circle();
        object r = new Rectangle();

        c.draw();
        r.draw();
    }
}
