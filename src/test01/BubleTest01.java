package test01;

public class BubleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length; //  상수는 대문자로 표기

        //4바퀴 돌기

        // 두번째 회전, 4바퀴 돌고 내부적으로 4바퀴

        for (int i = 0; i < N - 1; i++) {
            for (int k = 0; k < N - i - 1; k++) {
                System.out.println("1");
            }

        }


    }
}

