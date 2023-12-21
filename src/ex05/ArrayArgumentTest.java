package ex05;

public class ArrayArgumentTest {


    public static double miniArray(double[] list) {
        double min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

        double min;

        min = miniArray(a);
        System.out.println("첫번째 배열의 최소값" + min);
        min = miniArray(b);
        System.out.println("두번째 배열의 최소값" + min);


    }
}
