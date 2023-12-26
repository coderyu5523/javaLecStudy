package ex07.example;


// 구현체가 표시안되어 있음. 그럼 개발자가 구현체를 만들어야됨.
// 라이브러리 판매
interface EventListener {
    public abstract void action(); // public abstract 생략 가능

}

class MyApp {
    public void click(EventListener l) {
        l.action();
    }
}

// 개발자인 내가 구현체
//class button implements EventListener {
//    public void action() {
//        System.out.println("회원가입 로직이 실행됩니다.");
//    }
//
//}


public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> System.out.println("회원가입 로직이 실행됩니다."));   // class button 에서  필요한 걸 라이브러리로 사용. 컨트롤 + 스페이스 ()->{} 에 필요한 것 넣으면 됨


    }
}
