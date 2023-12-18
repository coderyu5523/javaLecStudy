package ex04;

class Person4 {
    //상태 = 변수 ,
    private int weight = 100;   //상태는 변수
    //객체 지향 프로그램은 행위없이 상태를 변경할 수 없다. 행위가 메서드,
    //  private 다른 클래스에서 접근이 안되게. 변경 불가

    public int getWeight() {              // public 뒤에 자료형 넣음. return 자료가 일치해야됨. () 자판기 투입구. 동작할 떄 뭔가 입력해야됨.
        return weight;   // weight       얘는 행위 상태는 아니고 그냥 투입구


    }

    // 행위 = 메서드. 행위를 통해 상태를 바꾼다.
    public void exercise() {    //  public  접근제어자. 어디서든 접근 가능.  exercise 는 이름
        weight = weight - 10;  // 같은 클래스에 속해서 우회 접속 가능


    }


}

public class OOPEx02 {                         //메서드가 있으면 행위를 해야 값이 변하기 떄문에 값을 예측할 수 있음. 메서드가 없으면 값을 마음대로 바꿀 수 있음,
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        for (int i = 0; i < 10; i++) {
            p4.exercise();
        }
        System.out.println("p4의 몸무게:" + p4.getWeight());


    }
}
