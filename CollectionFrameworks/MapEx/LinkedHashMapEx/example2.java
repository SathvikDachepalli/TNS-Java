package CollectionFrameworks.MapEx.LinkedHashMapEx;
import java.util.*;
public class example2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Key-Value pairs: " + map.entrySet());
        
        System.out.println("Key 100 exists in map? : " + map.containsKey(100));
        System.out.println("Key 103 exists in map? : " + map.containsKey(103));

        System.out.println("Invoking remove method with key 100");
        map.remove(100);
        System.out.println(map);
        

    }

}
