package CollectionFrameworks;

import java.util.*;

public class ListIteratoration {
    public static void main(String[] args) {
        List <String> list=new ArrayList<String>();

        list.add("Sai");
        list.add("Bhavani");
        list.add("Narsimha");
        list.add("Divya");
        list.add(1,"Durga");

        ListIterator<String> itr= list.listIterator();
        System.out.println("Travesing Elements in forward directions");
        while(itr.hasNext()){
            System.out.println("index: "+itr.nextIndex()+" Value: "+itr.next());
        }
        System.out.println("Repeat Elements in forward directions");
        while(itr.hasNext()){
            System.out.println("index: "+itr.nextIndex()+" Value: "+itr.next());
        }
        System.out.println("It wont work. Imagine you travelled to a deadend. You wont through the wall unless it is broken.");
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){
            System.out.println("index: "+itr.previousIndex()+" Value: "+itr.previous());
        }
        
    }
}
