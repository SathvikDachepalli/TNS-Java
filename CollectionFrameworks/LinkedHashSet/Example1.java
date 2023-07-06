package CollectionFrameworks.LinkedHashSet;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        l.add("Ravi");
        l.add("Vijay");
        l.add("Ravi");
        l.add("Ajay");
        Iterator<String> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
