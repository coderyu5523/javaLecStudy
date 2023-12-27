package ex08;

public class StringTest03 {

    public static void main(String[] args) {

        String data = "AABBBCCCCDDDDD";
        String[] arr = data.split("");

        int count = 1;
        int i = 0;
        if (arr[0].equals(arr[1]) == true) {
            count++;
            String result = arr[i].concat(Integer.toString(count));
            System.out.println(result);
        } else {
            count = 1;
            String result = arr[0].concat(Integer.toString(count)).concat(arr[1]);
            System.out.println(result);
        }

        if (arr[1].equals(arr[2]) == true) {
            count++;
            String result = arr[i].concat(Integer.toString(count));
            System.out.println(result);
        } else {
            String result = arr[1].concat(Integer.toString(count)).concat(arr[2]);
            System.out.println(result);
        }

    }
}

