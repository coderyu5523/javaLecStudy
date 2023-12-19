package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        // 1. 6회전 돌면서 로또 번호를 추첨한다.
        // 2. 첫번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 넣는다.
        // 3. 두번째 바퀴부터는 공을 꺼내서 이전의 추첨한 모든 번호와 비교 (isSame 값 만들기)
        // 4. isSame == ture( 3번부터 다시 시작)
        // 5. isSame == false (공집어넣기 - 3번부터 다시 시작)

        for (int i = 0; i < 6; i++) {
            // 공꺼내서  추가하는 코드
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;   // 아래 생략하고 다시 for문으로 돌아감
            }

            while (true) {
                // 공울 꺼내는 코드

                isSame = false;
                num = r.nextInt(45) + 1;  // i ==0 이랑 비교
                /**
                 * 이전 번호들과 비교하는 코드
                 * i == 1 (0이랑 비교)
                 * i == 2 (0, 1 비교)
                 * i == 3 (0,1,2, 비교)
                 */

                for (int j = i - 1; j >= 0; j--) {

                    if (arr[j] == num) {
                        isSame = true;// 같은게 있는지 체크
                        break;// 가장 가까운 for 문을 빠져나감.
                    }
                }

                //  동일한 번호가 없을 때 값 추가
                if (!isSame) {
                    arr[i] = num;
                    break;  // 값을 넣으면 탈출
                }


            }

        }
        System.out.println(Arrays.toString(arr));

    }
}


