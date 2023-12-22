package ex06.example2;

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
// 재정의는 다른 이름으로 만들어서 쓸 수 있기 때문에 큰 의의는 없다 . 다만 재정의를 쓰는 진짜 이유 오버라이딩 때문
//  부모 클래스에서 자식이 animal  을 상속. speak 를 사용하기 싫어서 speak로 다시 만든게 재정의
// 재정의를 하고 new 를 하면 cat과 animal 둘다 뜸. 이때 포인터를 둘다 가르킬 수 있는데 이를 다형성 이라고 함. "고양이야? yes. 동물이야? yes 이런 느낌.
// c1이 animal을 가르키고 있는데 speak 를 호출함. 근데 자식도 speak 를 가지고 있으면 부모 speak 를 무효함. 오버라이드
// 부모 speak 를 무시하고 자식 speak 를 실행하는 것은 동적 바인딩.

public class AnimalEx01 {

    public static void main(String[] args) {


        Animal c1 = new Cat(); //Cat c1 = new Cat();을 하게 되면 heap 에 cat과 animal이 heap 에 뜸.
        // animal 로 하고 오버라이딩 , animal 의 스피크를 호출했지만 자식이 재정의를 했기 때문에 cat의 스피크를 호

        // 동적 바인딩
        c1.speak();
        c1.run();
    }
}
