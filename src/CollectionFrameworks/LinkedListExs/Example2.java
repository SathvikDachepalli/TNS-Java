package CollectionFrameworks.LinkedListExs;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        System.out.println("Initial List of elements");
        obj.add("A");
        obj.add("B");
        obj.add("C");
        System.out.println("List 1 "+obj);
        System.out.println("After invoking add(E e) method");
        LinkedList <String> obj2=new LinkedList<String>();
        obj2.add("D");
        obj2.add("E");
        obj2.add("F");
        System.out.println("List 2 "+obj2);
        obj.addAll(obj2);
        System.out.println("After invoking addAll(Collection<? Extends E> method with obj)");
        System.out.println( "List 1 "+obj);
        LinkedList <String> obj3= new LinkedList<String>();
        obj3.add("G");
        obj3.add("H");
        System.out.println("List 3 "+obj3);
        obj.addAll(1, obj3);

        System.out.println("After invoking addAll(int index, Collection <? extends E> ) method");
        
        System.out.println("List 1 "+obj);

        obj.addFirst("I");
        System.out.println("After Invoking addFirst() ");
        
        System.out.println("List 1 "+obj);

        obj.addLast("J");
        System.out.println("After Invoking addLast()");
        
        System.out.println("List 1 "+obj);



    }
}
