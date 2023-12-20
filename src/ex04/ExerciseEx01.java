package ex04;


class People2 {
    private String name;
    private int age;
    private int weight;

    public People2(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void Diet() {
        this.weight = weight - 10;
    }

    void Aging() {
        this.age++;
    }

    @Override
    public String toString() {
        return "People2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

public class ExerciseEx01 {
    public static void main(String[] args) {
        People2 p2 = new People2("홍길동", 20, 80);
        System.out.println(p2);
        p2.Diet();
        p2.Aging();
        System.out.println(p2);
    }
}
