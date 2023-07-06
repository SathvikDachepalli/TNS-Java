package CollectionFrameworks.LinkedHashSet;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        LinkedHashSet <String> set= new LinkedHashSet<String>();

        set.add("Alfa Romeo");
        set.add("BMW");
        set.add("Chevrolet");
        set.add("Dodge");
        set.add("Equus");
        set.add("Fiat");
        set.add("BMW");
        Iterator <String> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    
    }
}
