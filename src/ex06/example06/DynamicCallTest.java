package ex06.example06;

class Animal {
    void speak() {
        System.out.println("animal 클래스의 사운드");
    }
}


class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class DynamicCallTest {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        Animal a2 = new Dog();

        Animal a3 = new Animal();

        a1.speak();
        a2.speak();
    }
}
