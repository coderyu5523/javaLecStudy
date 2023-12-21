package ex04;

//1. 자료형
//2. 조건문
//3. 반복문
//4. static heap stack
//5. 클래스 메서드
//6. 생성자 오버로딩 메서드오버로ㄷ딩
//7. 접근제어자
class Bird {  // 클래스 이면서 오브젝트 , 오브젝트는 new 할 수 있는 가능성이 있는 모든 것,
    // 상태 :무게 , 색상
    double weight;
    private String color;

    Bird(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void Eat() {
        this.weight = weight + 1;

    }

}

public class PractiseEx01 {
    public static void main(String[] args) {
        Bird b1 = new Bird(5.5, "빨강");  //  new 를 하면 새가 태어남. 인스턴스, 객체(object)
        Bird b2 = new Bird(5.0, "하얀");  //

        b1.Eat(); // 행위
        System.out.println(b1.weight);
        System.out.println(b2.weight);

        b2.Eat();
        System.out.println(b2.weight);
        System.out.println(b1.weight);

    }


}
