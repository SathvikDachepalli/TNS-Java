package CollectionFrameworks.HashTableEx;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Hashtable <Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(100,"Amit");
        ht.put(101,"Ravi");
        ht.put(102,"Vijay");
        ht.put(103,"Rahul");

        System.out.println("Initial Map: "+ht);
        ht.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+ht);
        ht.putIfAbsent(101,"Peter");
        System.out.println("Updated Map: "+ht);

    }
}
