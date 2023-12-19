package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6]; // 넣을 값이 없을때 이렇게 변수선언
        Random r = new Random();  // 랜덤으로 숫자를 뽑는 클래스
        int num;

        for (int i = 0; i < arr.length; i++) {              //알고리즘을 완벽한 패턴으로 만들기 어려울 수 있다. 이럴때는 예외 처리하면 편하다.
            if (i == 0) {
                num = r.nextInt(3) + 1;
                arr[i] = num;
            } else {
                while (true) {
                    num = r.nextInt(3) + 1;// ()개의 숫자를 0~n-1 중 하나를 뽑음. 1부터 뽑으려면 +1 붙여줘야됨

                    if (arr[i - 1] != num) {
                        arr[i] = num;
                        break;
                    }

                }


            }
        }


        System.out.println(Arrays.toString(arr));


    }
}
