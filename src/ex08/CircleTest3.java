package ex08;

class Circle4 {
    int radius;

    public Circle4(int radius) {
        this.radius = radius;
    }

    public boolean equals(Circle4 c1) {
        if (radius == c1.radius) {
            return true;
        } else {
            return false;
        }
    }


}

public class CircleTest3 {
    public static void main(String[] args) {
        Circle4 obj1 = new Circle4(10);
        Circle4 obj2 = new Circle4(10);

        if (obj1.equals(obj2)) {
            System.out.println("2개의 원은 같습니다");
        } else {
            System.out.println("2개의 원은 같지 않습니다.,");
        }


    }
}
