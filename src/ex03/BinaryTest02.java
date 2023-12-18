package ex03;

import java.util.Scanner;

public class BinaryTest02 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 값을 입력하세요:");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int count = 0;

        while (true) {
            mid = start + ((end - start) / 2);
            count = count + 1;

            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        System.out.println("타겟의 위치는 " + mid);
        System.out.println("검색 횟수 :" + count);
    }
}


