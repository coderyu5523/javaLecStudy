package ex04;

//설계도
class people1 {  // 클래스의 상태를 정의하는게 1번
    String name; // heap 에 있는 변수.
    int power;  // 여기서 가ㅣㅄ이 설정되면 변경도ㅚ지 않고 같은 값만 출력됨
    int hp;

    //객체의 초기화는 생성자
    //생성자 , 초기값으로 만듬. 게임 시작할 때
    public people1(String name, int power) {   // alt + insert 로 하면 생성자 초기화할 수 있음 , 매개변수 name 은 stack 에 저장됨.
        this.name = name;          // 여기의 name 은 heap 에 있는 변수. 구분을 위해서 this 사용
        this.power = power;
        this.hp = 100;  // 고정값이면 상수로 받음.
    }

    //행위. 메서드 게임 플레이하면서 레벨을 올리는 것.
    public void upgradePower() {
        this.power++;

    }

    @Override
    public String toString() {            //alt+insert  tostring
        return "people{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {
    public static void main(String[] args) {
        people1 p1 = new people1("티모", 10); //매개변수로 값을 전달 받아서 객체의 상태로 옮김

        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}
