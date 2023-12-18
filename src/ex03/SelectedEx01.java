package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3, 1, 10};
        final int N = arr.length;
        int rep;
        int min;
        
        for (rep = 0; rep < N - 1; rep++) {
            min = rep;
            for (int i = rep + 1; i < N; i++) {
                if (arr[min] > arr[i]) {  // 5,8,2,4,3 -> min = 0
                    min = i;
                }

            }

            if (rep != min) {
                int temp = arr[min];
                arr[min] = arr[rep];
                arr[rep] = temp;
            }

        }
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }  // end main
}
