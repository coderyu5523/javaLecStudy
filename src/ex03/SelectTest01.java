package ex03;

public class SelectTest01 {

    public static void main(String[] args) {


        int[] arr = {10, 7, 5, 1, 4};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                arr[i] = arr[0];
                arr[0] = min;

            }
        }
        min = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                arr[i] = arr[1];
                arr[1] = min;

            }
        }
        min = arr[2];
        for (int i = 3; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                arr[i] = arr[2];
                arr[2] = min;

            }
        }
        min = arr[03];
        for (int i = 4; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                arr[i] = arr[3];
                arr[3] = min;

            }
        }


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


    }
}
