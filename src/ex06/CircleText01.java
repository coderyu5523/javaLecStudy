package ex06;

class Shap {
    int x, y;


}

class Circ extends Shap {
    int radius;


    public Circ(int radius) {
        this.radius = radius;
        this.x = 1;
        this.y = 2;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }


}

public class CircleText01 {
    public static void main(String[] args) {
        Circ c = new Circ(10);
        System.out.println("원의 넓이:" + c.getArea());
        System.out.println("원의 좌표:" + c.x + "," + c.y);
    }
}
