package ex06.example06;

class Shape {
    public void draw() {
        System.out.println("shape");
    }
}

class circle extends Shape {
    public void draw() {
        System.out.println("circle");
    }
}

class rectangle extends Shape {
    public void draw() {
        super.draw();
        System.out.println("rectangle");
    }
}

class triangle extends Shape {
    public void draw() {
        System.out.println("triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.draw();

    }
}
