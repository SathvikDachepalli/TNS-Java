package CollectionFrameworks.MapEx.HashMapEx;
import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+map);
        map.put(100,"Amit");  // put() method is used to add elements in the map
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        System.out.println("After invoking put() method: "+map);
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(103,"Gaurav"); // if key is not present, then only it will add
        System.out.println("After invoking putIfAbsent() method: "+map);
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        map2.put(104,"Ravi");
        map2.putAll(map);  // putAll() method is used to copy all the elements of one map to another map
        System.out.println("After invoking putAll() method: "+map2);
        for (Map.Entry<Integer,String> m:map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map2.putIfAbsent(101, "Sathvik");  // As key 101 is already present, it will not add
        System.out.println("After invoking putIfAbsent() method: ");
        for (Map.Entry<Integer,String> m:map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(102);  // remove() method is used to remove the element from the map
        System.out.println("After invoking remove() method: "+map);
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(101, "Sathvik");  // 101 is present but value is not Sathvik, so it will not remove
        System.out.println("After invoking remove() method: "+map);
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
