package CollectionFrameworks.MapEx.HashMapEx;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Using get() method...");
        System.out.println(map.get(4));
        System.out.println("Using For Loop...");
        for(int i=1;i<=map.size();i++){
            System.out.println(map.get(i));
        }
        map.put(1, "Orange");
        System.out.println("After invoking put() method for duplicate key...");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
