package ex07.exampleEx02;

interface RomoteControl {
    void turnOn();

    void turnOff();

    public default void printBrand() {
        System.out.println("Remote Control 가능 tv");
    }
}

class Tellvesion implements RomoteControl {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    public void printBrand() {
        System.out.println("POWER Java TV 입니다.");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {

        RomoteControl obj = new Tellvesion();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}
