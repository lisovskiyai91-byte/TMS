package TMSnew.homework7.TMS.homework16;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfNonEmptyStrings {
    public static Map<String, String> pairs(String[] words) {
        Map<String, String> map = new HashMap<>();
        for (String word : words) {
            String first = word.substring(0, 1);
            String last = word.substring(word.length() - 1);
            map.put(first, last);
        } return map;
    }
    public static void main(String[] args) {
        String[] words1 = {"code", "bug"};
        String[] words2 = {"man", "moon", "main"};
        String[] words3 = {"man", "moon", "good", "night"};
        System.out.println(pairs(words1));
        System.out.println(pairs(words2));
        System.out.println(pairs(words3));
    }
}