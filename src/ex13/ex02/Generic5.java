package ex13.ex02;

class Box2 {
    private Object data;

    public void set(Object data) {
        this.data = data;
    }

    public Object get() {
        return data;
    }
}

public class Generic5 {
    public static void main(String[] args) {

        Box2 b1 = new Box2();
        b1.set(1);
        int i = (Integer) b1.get();

    }
}
