package ex08.example;

public class StringEx04 {
    public static void main(String[] args) {

        String data = "AABBBCCCCDDDD";
        StringBuilder sb = new StringBuilder();

        char ar = data.charAt(0);

        int count = 1;

        if (data.charAt(0) == data.charAt(1)) {
            count++;
        } else {
            sb.append(data.charAt(0)).append(count);
            count++;
        }
        System.out.println(sb);


        if (data.charAt(1) == data.charAt(2)) {
            count++;
        } else {
            sb.append(data.charAt(1)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(2) == data.charAt(3)) {
            count++;
        } else {
            sb.append(data.charAt(2)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(3) == data.charAt(4)) {
            count++;
        } else {
            sb.append(data.charAt(3)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(4) == data.charAt(5)) {
            count++;
        } else {
            sb.append(data.charAt(4)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(5) == data.charAt(6)) {
            count++;
        } else {
            sb.append(data.charAt(5)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(6) == data.charAt(7)) {
            count++;
        } else {
            sb.append(data.charAt(6)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(7) == data.charAt(8)) {
            count++;
        } else {
            sb.append(data.charAt(7)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(8) == data.charAt(9)) {
            count++;
        } else {
            sb.append(data.charAt(8)).append(count);
            count = 1;
        }
        System.out.println(sb);


    }
}
