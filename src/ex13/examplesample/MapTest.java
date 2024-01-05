package ex13.examplesample;


import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map = Map.of("kim", "1234", "lee", "2345", "han", "3456");

        System.out.println(map);
        System.out.println(map.get("lee"));

    }
}
