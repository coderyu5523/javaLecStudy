package ex03;

public class Exercise05 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int result = 0;
        int sum = i + j;

        for (j = 1; j < 7; j++) {
            for (i = 1; i < 7; i++) {
                if (sum == 6) {
                    System.out.print("(" + i + "," + j + ")");

                }
            }

        }


    }
}