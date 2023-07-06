package CollectionFrameworks.HashTableEx;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(100,"Amit");
        ht.put(101,"Ravi");
        ht.put(102,"Vijay");
        ht.put(103,"Rahul");
        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(ht);

    }
}
