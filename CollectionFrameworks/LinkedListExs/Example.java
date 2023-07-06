package CollectionFrameworks.LinkedListExs;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        
        Iterator <String> itr= obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(obj);
    }
}
