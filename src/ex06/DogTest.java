package ex06;

class Animal {
    int age;

    void eat() {
        System.out.println("먹고있음...");
    }


}

class Dog extends Animal {  //

    void bark() {
        System.out.println("짖고 있음...");
    }
}

public class DogTest {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();

        d.eat();   // dog 클래스로도 animal 클래스를 사용할 수 있음


    }
}
