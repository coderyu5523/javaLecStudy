package ex06.example4;

public class StarApp {

    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack(); // 서로 한대씩 때림
        u2.attack();
    }


    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1");
        Protoss d1 = new Dragoon("d1");
        Protoss r1 = new River("r1");
        Protoss dark1 = new Dark("dark1");


        gameStart(z1, d1);
        gameStart(d1, z1);
        gameStart(r1, z1);
        gameStart(d1, dark1);


    }
}
