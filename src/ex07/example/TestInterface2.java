package ex07.example;

interface Remotecon {
    void turnOn();

    void turnOff();

    public default void printBrand() {
        System.out.println("remote control 가능 tv");
    }
}

class Television implements Remotecon {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("tv가 켜졌습니다");
    }

    public void turnOff() {
        on = false;
        System.out.println("tv가 꺼졌습니다");
    }

    public void printBrand() {
        System.out.println("power java tv입니다.");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {

    }

}


