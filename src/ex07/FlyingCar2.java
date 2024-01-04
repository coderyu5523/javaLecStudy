package ex07;


interface Flyable1 {
    void fly();
}

class Car {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("스피드: " + this.speed);
    }
}

public class FlyingCar2 extends Car implements Flyable1 {
    public void fly() {
        System.out.println("im flying");

    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        obj.fly();


    }
}
