package ex13;

class Box<T> {   //   <대문자>   자료형을 정하지 않았을떄
    T data;
}


public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box1 = new Box();     // 제네릭은 new 할 때 타입이 정해짐. 그래서 제네릭은 static 을 못씀
        Box<Integer> box2 = new Box();

        box1.data = "1";
        box2.data = 1;

    }
}
