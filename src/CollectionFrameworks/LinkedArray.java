package CollectionFrameworks;
import java.util.*;
public class LinkedArray {
    public static void main(String[] args) {
        List <String> aList= new ArrayList<String>();
        aList.add("CBum");
        aList.add("Mike Tyson");
        aList.add("Bruce Lee");

        List <String> l = new LinkedList<String>();
        l.add("Robert Downey Jr");
        l.add("Pedro Pascal");
        l.add("Keanu Reeves");
        l.add("Tom Holland");

        System.out.println(aList.get(1));
        System.out.println(l.get(1));
    }
}
