package ex06.example07;

class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

}

class ColorRectangle extends Rectangle {
    String color;

    public ColorRectangle(int width, int height, String color) {
        super(width, height);
        this.color = color;
    }
}


public class Ex04 {
    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(100, 100, "blue");
        System.out.println("가로:" + obj.height);
        System.out.println("세로:" + obj.width);
        System.out.println("색상:" + obj.color);


    }
}
