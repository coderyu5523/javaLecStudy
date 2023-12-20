package ex04;

class Cat {
    String name;

    Cat() {
        //this.name ="토비"; 이 디스는 heap 의 this
        this("토비");  //이 this 는 Cat(String name) 거
    }

    Cat(String name) {
        this.name = name;
    }
}

//
public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.name);
    }


}
