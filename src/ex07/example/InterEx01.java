package ex07.example;

interface RemoteControl {  // new 못함, 오브젝트가 아님.
    public abstract void on();  // public abstract 생략가능

    public abstract void off(); // 인터페이스는 메서드 강제화
}

class SamsungRemocon implements RemoteControl {

    @Override
    public void on() {
        System.out.println("삼성 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

class LgRemocon implements RemoteControl {

    @Override
    public void on() {
        System.out.println("LG 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

/**
 * 작성자 : 홍길동
 * 작성일 : 2023년 12월 26일
 * 구현체 : SamsungRemocon , LgRemocon
 */
class ComnmonRemocon {
    private RemoteControl r;    // 인터페이스 or 추상클래스.

    public ComnmonRemocon(RemoteControl r) {
        this.r = r;
    }

    public void on() {
        r.on();
    }

    public void off() {
        r.off();
    }
}

public class InterEx01 {


    public static void main(String[] args) {

        ComnmonRemocon cr = new ComnmonRemocon(new SamsungRemocon());  //public ComnmonRemocon(Remocon r) , Remocon r = new SamsungRemocon()   이거라서 대입할 수 있음.
        cr.on();
    }
}
