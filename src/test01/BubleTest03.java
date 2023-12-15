package test01;

public class BubleTest03 {
    public static void main(String[] args) {
        int[] arr = {5, 8};
        //스왑, 담을 변수가 하나필요함

        int temp; // 스왑을 할떄는 먼저 옮겨야됨
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
