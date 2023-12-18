package ex04;

class Person3 {
    int weight = 100;   //상태는 변수
                         //객체 지향 프로그램은 행위없이 상태를 변경할 수 없다. 행위가 메서드,
                        //
}


public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게:" + p3.weight);

        p3.weight = 60;                                  // 몸무게는 운동(행위)을 해야 살이 빠진다(상태). 그냥 값을 바꾼건 마법으로 살이 빠진 것.
        System.out.println("p3의 몸무게:" + p3.weight);
    }
}
