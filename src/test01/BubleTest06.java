package test01;

public class BubleTest06 {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int temp;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}


