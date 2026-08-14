package TMSnew.homework7.TMS.homework16;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfStringMap {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> map = new HashMap<>();
        for (String word: words){
            if (!map.containsKey(word)){
                map.put(word, false);
            } else {
                map.put(word,true);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(words1));
        System.out.println(wordMultiple(words2));
        System.out.println(wordMultiple(words3));
    }
    }
