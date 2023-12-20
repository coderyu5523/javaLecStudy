package ex04;

public class CicleTest {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();


        obj.radius = 100;
        obj.color = " blue";
        obj1.radius = 100;
        obj1.color = "red";
        obj2.radius = 200;
        obj2.color = "blue";
        double area = obj.getArea();
        System.out.println("원의 면적=" + area);

    }
}
