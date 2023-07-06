package CollectionFrameworks.HashTableEx;
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(100,"Amit");
        ht.put(101,"Ravi");
        ht.put(102,"Vijay");
        ht.put(103,"Rahul");
        System.out.println(ht.getOrDefault(101, "Not Found"));
        System.out.println(ht.getOrDefault(105, "Not Found"));
    }
}
