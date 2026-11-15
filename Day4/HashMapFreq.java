import java.util.*;
public class HashMapFreq{
    public static void main(String[] args) {
        String books[]={"dsa","os","java","java","maths","os","sql","sql"};
        HashMap<String , Integer> mp=new HashMap<>();
        for(String s:books){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        for(String key:mp.keySet()){
            System.out.println(key+" "+mp.get(key));
        }
    }
}