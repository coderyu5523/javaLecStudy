package ex13;

class Dog {
    String name;
    int age;

    public void speak() {
        System.out.println("멍멍");
    }
}


class Cat {
    String name;
    int age;

    public void speak() {
        System.out.println("야옹");
    }

}


public class GenericEx03 {
    public static void main(String[] args) {
        Object[] arr = new Object[2];  // 오브젝트 타입
        arr[0] = new Dog();
        arr[1] = new Cat();

        //arr[0].speak();  오브젝트 타입으로 만들면 오브젝트에 spaek 메서드가 없어 오버라이딩이 안됨 그래서 호출할 수가 없음. 그래서 사용하려면 다운캐스팅을 해야됨. 오브젝트의 단점,
        Dog d1 = (Dog) arr[0];  // [object, dog]
        Cat c1 = (Cat) arr[1]; // [object , cat]

        d1.speak();
        c1.speak();

    }
}
