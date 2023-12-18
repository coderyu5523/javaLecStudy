package ex03;

public class BinaryTest01 {
    public static void main(String[] args) {
        // 2진검색 > 반드시 정렬이 되어있어야 됨
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // target - 8
        //0~8번지 서치
        // mid = N/2 = 4 arr[4] =5
        //if(8==5) 거짓일때
        // if(8>5) 참일 때
        // 5~ 8번지 서치
        // mid = 7 arr[7] > 값 8
        // if (8==8) 일때 참
    }
}
