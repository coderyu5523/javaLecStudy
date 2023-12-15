package ex03;

public class BubleEx01 {
    static void bubble(int[] arr) {               //메서드

        final int N = arr.length;
        int temp;

        for (int k = 1; k < N; k++)

            for (int i = 0; i < N - k; i++) {

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 4, 3};
        int[] arr2 = {3, 5, 7, 100, 30, 10, 15};
        BubleEx01.bubble(arr);  //  BubleEx01. 는 같은 클래스 안에 있으면 생략가능
        System.out.println("");
        bubble(arr2);
    }
}
