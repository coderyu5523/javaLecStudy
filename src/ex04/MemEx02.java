package ex04;


class Person2 {   // 커스텀 자료형 / 내가 만든 자료형
    int age = 10;
    char gender = '남';

}

public class MemEx02 {
    public static void main(String[] args) {

        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p = new Person2();     // new를 붙이면 원하는 시점에 띄울 수 있음, heap 은 class에 적은 이름이 자료형, 변수
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println("메인 종료");
    }


}
