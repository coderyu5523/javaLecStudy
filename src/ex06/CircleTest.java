package ex06;

class Shape {
    int x, y;

    public Shape(int x, int y) {  // 매개변수 있는 생성자. 디폴트 생성자가 있으면 자식 클래스가 디폴트 생성자를 호출하고 이거는 실행안됨
        this.x = x;
        this.y = y;
    }

    public Shape() {        //디폴트 생성자
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape { //Shape 는 부모 ,circle 은 자식
    int radius; // 반지름


    public Circle(int radius) {  // 생성자.  부모의 디폴트 생성자를 호출함.
        super(1, 2); //extends 되어있을 때는 super(); 가 생략되어 있어 디폴트 생성자를 호출함. 그래서 매개변수가 있는 생선자는 따로 super로 값을 넣어야 됨;
        System.out.println("Circle 생성됨");

        this.radius = radius;
        System.out.println("1");
        super.x = 0;                         //this 는 자신, super는 부모
        super.y = 0;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);   // circle 메서드를 실행하면 부모 shape 을 먼저 호출하고, 다음에 circle 이 실행된다.
        circle.getArea();

    }
}
