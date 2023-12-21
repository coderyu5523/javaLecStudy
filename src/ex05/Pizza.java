package ex05;

public class Pizza {         // 객체 생성
    private String toppings;
    private int radius;
    static final double Pi = 3.141592;
    static int count = 0;

    public Pizza(String toppings) {
        this.toppings = toString();
        this.count = this.count + 1;

    }

}
