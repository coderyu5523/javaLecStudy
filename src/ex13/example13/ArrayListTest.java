package ex13.example13;

import java.util.ArrayList;

class point {
    int x, y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<point> list = new ArrayList<>();
        list.add(new point(0, 0));
        list.add(new point(4, 0));
        list.add(new point(3, 5));
        list.add(new point(-1, 3));
        list.add(new point(13, 2));

        System.out.println(list);


    }
}
