package CollectionFrameworks.TreeSetExs;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        TreeSet<String> t= new TreeSet<String>();
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("E");
        t.add("F");
        t.add("G");
        System.out.println(t);
        Iterator<String> itr=t.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<String> ditr=t.descendingIterator();
        while(ditr.hasNext()){
            System.out.println(ditr.next());
        }
    }
}
