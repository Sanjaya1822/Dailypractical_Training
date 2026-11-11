import java.util.*;
public class GroupAnagrams{
    public static void main(String[] args) {

        String[] words = {"listen", "silent", "stone", "notes", "enlist"};
        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(word);
        }
        System.out.println(groups);
    }
}
