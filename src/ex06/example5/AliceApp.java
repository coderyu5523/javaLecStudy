package ex06.example5;

abstract class 판사 {             // abstract 추상 클래스, 추상클래스는 오브젝트가 아님. new 할 수 없는 것.
    public abstract void 심문(); // 추상 메서드, 행위의 구체적인 것들은 오브젝트를 활용하고 이거는 통로로만 활용
}                                 // 추상 클래스는 상속을 해서 자식 클래스를 띄울때 같이 뜬다.

// abstract 를 하게 되면 자식 클래스에서 메서드 이름이 고정되게 된다. alt + enter , 재정의를 강제
abstract class 증인 {              //추상적인 것
    public abstract void 대답();
}

class 왕 extends 판사 {
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다.");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }
}

class 엘리스 extends 증인 {

    public void 대답() {
        System.out.println("엘리스는 대답한다.");

    }
}


public class AliceApp {


}
