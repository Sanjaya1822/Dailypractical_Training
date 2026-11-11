import java.util.*;
public class HashMapEX{
    public static void main(String[] args) {
        Map<String , Integer> mp=new HashMap<>();
        mp.put("A",20);
        mp.put("B",25);
        mp.put("C",30);
        for(String key:mp.keySet()){
            System.out.println("Person: "+key+ "-> Age" +mp.get(key));
        }
    }
}