package ex13.example13;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        for (String key : map.keySet()) {
            System.out.println("key=" + key + ", value= " + map.get(key));
        }


        map.forEach((key, value) -> {
            System.out.println("key=" + key + ",value=" + value);
        });


    }
}
