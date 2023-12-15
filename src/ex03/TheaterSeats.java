package ex03;

public class TheaterSeats {
    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };


        int count = 0;

        for (int row = 0; row < seats.length; row++) {
            for (int i = 0; i < seats[row].length; i++) {
                count = count + seats[row][i];
            }
            System.out.println(row + "번째 행의 1의 수는 :" + count);
        }
        System.out.println("1의 수는 :" + count);
    }
}
