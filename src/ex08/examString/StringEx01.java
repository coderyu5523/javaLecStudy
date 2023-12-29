package ex08.examString;

public class StringEx01 {
    public static void main(String[] args) {


        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");

        String s = "hello world";
        int size = s.length();
        char c = s.charAt(1);


        String[] tokens = "100,200,300".split(",");
        for (String token : tokens) {
            System.out.println(token);
        }

        StringBuffer s6 = new StringBuffer("hello");
        int length = s6.length();
        int capacity = s6.capacity();

        StringBuffer sb = new StringBuffer("10+20");
        sb.append(10 + 20);
        sb.insert(0, "수식");


        System.out.println(length);
        System.out.println(capacity);


        String sentence = "이것은 예제입니다";
        String[] words = sentence.split("\\s+");
        System.out.println(words[0]);

    }


}
