package ex07.ex02;

interface RemoteControl {
    public abstract void turnOn();

    public abstract void turnOff();
}

class Rmc1 implements RemoteControl {

    public void turnOn() {
        System.out.println("Rmc1 리모컨이 켜집니다.");
    }

    public void turnOff() {
        System.out.println("Rmc2 리모컨이 꺼집니다.");
    }

}

class Rmc2 implements RemoteControl {

    public void turnOn() {
        System.out.println("Rmc2 리모컨이 켜집니다.");
    }

    public void turnOff() {
        System.out.println("Rmc2 리모컨이 꺼집니다.");
    }
}

public class example11 {
    public static void main(String[] args) {
        RemoteControl r1 = new Rmc1();
        RemoteControl r2 = new Rmc2();
        r1.turnOn();
        r2.turnOff();
    }
}
