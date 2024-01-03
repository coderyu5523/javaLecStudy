package ex13.ex02;

class Dog {

    public void speak() {
        System.out.println("멍멍");
    }
}


public class Generic3 {
    public static void main(String[] args) {
        Object[] arr = new Object[1];

        Dog d1 = new Dog();

        d1.speak();

    }

}
