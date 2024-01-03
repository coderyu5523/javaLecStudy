package ex13.ex02;

class Box<T> {
    T data;
}


public class Generic1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box();
        Box<String> b2 = new Box();

        b1.data = 1;
        b2.data = "1";


    }

}
