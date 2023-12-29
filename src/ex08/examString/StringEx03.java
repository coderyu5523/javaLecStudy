package ex08.examString;

public class StringEx03 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" everyone");
        sb.insert(0, "인사:");
        sb.replace(3, 8, "hi");
        sb.delete(6, 15);
        String result = sb.toString();

        System.out.println(result);

    }
}
