package ex05;

public class StaticBlock {
    static int number;
    static String s;

    static {
        number = 23;
        s = "hello world";

    }

    public static void main(String[] args) {
        System.out.println("number:" + number);
        System.out.println("s:" + s);


    }


}
