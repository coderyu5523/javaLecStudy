package ex04;


//설계도
public class Circle {

    private int radius;

    //  생성자 . 생성될때 무조건 실행되는 메서드 .
    public Circle(int r) {  // 안적으면 생략되어있지만 자동생성됨.
        //radius = 50;  //최초값 세팅 , 실행되기 전 static 되지 않는 모든 클래스가 뜸.  초기화코드
        radius = r;  // 최초에
    }

    public double getArea() {

        return 3.14 * radius * radius;

    }

}
