package ex13.example13;

import java.util.Vector;

class Monster {
    String name;
    double hp;

    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}


public class VectorExample2 {
    public static void main(String[] args) {

        Vector<Monster> list = new Vector<>();

        list.add(new Monster("mon1", 100));
        list.add(new Monster("mon2", 200));
        list.add(new Monster("mon3", 300));

        System.out.println("벡터의 크기:" + list.size());
        System.out.println(list);


    }
}
