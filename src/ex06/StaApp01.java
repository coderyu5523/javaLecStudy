package ex06;

abstract class Terran {
    public abstract void attack();
}

class Marine extends Terran {

    String name;

    public Marine(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("마린이 공격합니다");
    }

}

class Tank extends Terran {
    String name;

    public Tank(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("탱크가 공격합니다");
    }
}


public class StaApp01 {
    public static void main(String[] args) {
        Terran m1 = new Marine("m1");
        Terran t1 = new Tank("t1");

        m1.attack();
        t1.attack();
    }
}
