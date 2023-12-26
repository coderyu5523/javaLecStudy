package ex06.example07;

public class CircleEx01 extends PizzaEx01 {
    protected String name;
    protected int radius;

    public CircleEx01(String name, int radius) {
        this.name = name;
        this.radius = radius;

    }

    public void print() {
        System.out.println("피자의 종류:" + name + ", 피자의 크기:" + radius);
    }

}
