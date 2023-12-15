package ex03;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] rarray = new int[3][];

        rarray[0] = new int[]{1, 2, 3, 4,};
        rarray[1] = new int[]{5, 6, 7,};
        rarray[2] = new int[]{8, 9};
        for (int i = 0; i < 3; i++) {
            System.out.println(rarray[i]);


        }


    }


}
