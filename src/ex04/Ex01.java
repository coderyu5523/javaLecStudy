package ex04;


class People {
    int age = 10;
}

public class Ex01 {
    public static void main(String[] args) {

        People p1 = new People();
        System.out.println(p1.age);
        p1.age = 20;
        System.out.println(p1.age);


        People p3 = new People();
        p3.age = p1.age;

        System.out.println(p3.age);
    }
}
