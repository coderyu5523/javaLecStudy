package ex07.exampleEx02;

interface Drivable {
    void drive();
}

interface Flyable1 {
    void fly();
}

public class FlyingCar1 implements Drivable, Flyable1 {
    public void drive() {
        System.out.println("im driving");
    }

    public void fly() {
        System.out.println("im flying");
    }


    public static void main(String[] args) {
        FlyingCar1 f = new FlyingCar1();
        f.drive();
        f.fly();


    }
}
