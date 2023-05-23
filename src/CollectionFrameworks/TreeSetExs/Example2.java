package CollectionFrameworks.TreeSetExs;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        TreeSet <Integer> t= new TreeSet<Integer>();
        t.add(23);
        t.add(12);
        t.add(4);
        t.add(18);
        t.add(1);

        System.out.println(t);
        System.out.println(t.descendingSet());
        System.out.println("Head Set: "+t.headSet(4,true));
    
        
    
    }
}
