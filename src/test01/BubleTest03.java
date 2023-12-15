package test01;

public class BubleTest03 {
    public static void main(String[] args) {
        int[] arr = {5, 8};
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
