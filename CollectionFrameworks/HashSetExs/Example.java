package CollectionFrameworks.HashSetExs;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Alfa Romeo");
        set.add("BMW");
        set.add("Chevrolet");
        set.add("Dodge");
        set.add("Equus");
        set.add("Fiat");
        set.add("BMW");
        
        Iterator <String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();
        System.out.println("An initial list of elements: "+set);
        set.remove("BMW");
        System.out.println("After removing BMW :"+set);
        System.out.println("Even tho we added two BMW's, we can see in Hashset");
    }
}
