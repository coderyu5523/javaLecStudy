package ex07;

abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("사각형");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("원");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        c.draw();
        r.draw();
    }
}
