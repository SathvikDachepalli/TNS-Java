package CollectionFrameworks.MapEx.HashMapEx;
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+map);
        map.put(100,"Amit");  // put() method is used to add elements in the map
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103,"Sathvik");

        System.out.println("List of elements: "+map);

        map.remove(100);
        System.out.println("After invoking remove() method: "+map);
        map.remove("Vijay");
        System.out.println("After invoking remove() method: "+map);
        map.remove(102, "Rahul");
        System.out.println("After invoking remove() method: "+map);
        
    }
}
