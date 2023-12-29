package ex08.examString;

public class StringEx02 {
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD";
        StringBuffer sb = new StringBuffer();

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

        if (data.charAt(9) == data.charAt(10)) {
            count++;
        } else {
            sb.append(data.charAt(9)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(10) == data.charAt(11)) {
            count++;
        } else {
            sb.append(data.charAt(10)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(11) == data.charAt(12)) {
            count++;
        } else {
            sb.append(data.charAt(11)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(12) == data.charAt(13)) {
            count++;
        } else {
            sb.append(data.charAt(12)).append(count);
            count = 1;
        }
        System.out.println(sb);

        if (data.charAt(13) == data.charAt(14)) {
            count++;
        } else {
            sb.append(data.charAt(13)).append(count);
            count = 1;
        }
        System.out.println(sb);
    }
}
