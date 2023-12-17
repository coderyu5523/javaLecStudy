package ex03;

public class Exercise03 {
    public static void main(String[] args) {
        String[][] three = {
                {"1", "2", "짝", "4", "5", "짝", "7", "8", "짝", "10"},
                {"11", "12", "짝", "14", "15", "짝", "17", "18", "짝", "20"},
                {"21", "22", "짝", "24", "25", "짝", "27", "28", "짝", "30"},
                {"31", "32", "짝", "34", "35", "짝", "37", "38", "짝", "40"},
                {"41", "42", "짝", "44", "45", "짝", "47", "48", "짝", "50"}
        };


        for (int k = 0; k < three.length; k++) {
            String[] three1 = three[k];
            for (int i = 0; i < three[k].length; i++) {
                System.out.print(three[k][i] + "\t");
            }
        }


    }


}
