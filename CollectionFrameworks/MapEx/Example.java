package CollectionFrameworks.MapEx;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("After invoking remove() method");
        map.remove(102);
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("After invoking replace() method");
        map.replace(101,"Amit","Ravi");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
