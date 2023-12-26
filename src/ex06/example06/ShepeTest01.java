package ex06.example06;

class Shape1 {
    protected int x, y;

    public void draw() {
        System.out.println("shape draw");
    }
}

class rectangle1 extends Shape1 {
    private int width, height;

    public void draw() {
        System.out.println("ractangle draw");
    }
}

class triangle1 extends Shape1 {
    private int base, height;

    public void draw() {
        System.out.println("triangle draw");
    }
}

class circle1 extends Shape1 {
    private int radius;

    public void draw() {
        System.out.println("circle draw");
    }
}

public class ShepeTest01 {

    public static void print(Shape obj) {
    }

    public static void main(String[] args) {


    }

}
