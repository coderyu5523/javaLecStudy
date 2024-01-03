package ex13.ex02;

class Dog1<T> {

    public void speak() {
        System.out.println("멍멍");
    }
}

class Cat1<T> {

    public void speak() {
        System.out.println("야옹");
    }
}

public class Generic4 {
    public static void main(String[] args) {
        Dog1<String> d1 = new Dog1();
        Cat1<String> c1 = new Cat1();

        d1.speak();
        c1.speak();
        
    }
}
