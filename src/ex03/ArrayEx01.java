package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {


        int[] arr = new int[3];  // 남는 공간 중 연속된 곳을 할당하기 때문에 미리 공간을 입력해야 됨.
        arr[0] = 1;   // 각 공간에 할당된 주소를 인덱스 arr[0]
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }

    }


}
