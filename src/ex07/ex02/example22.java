package ex07.ex02;

class R1 {
    public void on() {
        System.out.println("Rmc1 리모컨이 켜집니다");
    }

    public void off() {
        System.out.println("Rmc1 리모컨이 꺼집니다");
    }
}

class R2 {
    public void asd1() {
        System.out.println("Rmc2 리모컨이 켜집니다");
    }

    public void asd2() {
        System.out.println("Rmc2 리모컨이 꺼집니다");
    }

}

public class example22 {
    public static void main(String[] args) {
        R1 rr1 = new R1();
        R2 rr2 = new R2();

        rr1.on();
        rr2.asd1();

    }
}
