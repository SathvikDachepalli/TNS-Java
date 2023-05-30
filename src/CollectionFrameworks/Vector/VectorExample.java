package CollectionFrameworks.Vector;
import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Vector <String> v = new Vector<String>(3);

        v.add("Tiger");
        v.add("Lion");
        v.add("Dog");
        v.add("Cat");
        v.add("Elephant");
        System.out.println("Size is: "+v.size());
        System.out.println("Vector elements are: "+v);
        System.out.println("Default capacity increment is: "+v.capacity());
        v.addElement("Rat");
        v.addElement("Deer");
        System.out.println("Size after addition: "+v.size());
        System.out.println("Capacity after increment is: "+v.capacity());
    }
}
