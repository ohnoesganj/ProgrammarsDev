package day3.map;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("사과", "apple");
        map.put("바나나", "banana");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
