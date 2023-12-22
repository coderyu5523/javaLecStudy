package ex06.example;

class Animal {


    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다.");
    }
}

class Cat extends Animal {
    // 재정의 부모가 들고 있는 메서드를 가려버림 , alt + insert -override method
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.speak();
        c1.run();
    }
}
