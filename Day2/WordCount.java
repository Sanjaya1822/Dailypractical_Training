import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        String[] words = {"java", "python", "java", "c", "python", "java"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } 
            else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}
