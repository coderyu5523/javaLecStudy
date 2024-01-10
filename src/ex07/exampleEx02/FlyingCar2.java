package ex07.exampleEx02;

interface Flyable {
    void fly();
}

class Car {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


public class FlyingCar2 extends Car implements Flyable {
    public void fly() {
        System.out.println("im flying");
    }

    public static void main(String[] args) {
        FlyingCar2 f2 = new FlyingCar2();
        f2.setSpeed(300);
        f2.fly();
    }
}
