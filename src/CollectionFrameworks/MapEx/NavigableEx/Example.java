package CollectionFrameworks.MapEx.NavigableEx;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103 ,"Sathvik");

        System.out.println("descendingMap: " + map.descendingMap());

        System.out.println("headMap: " + map.headMap(102, true));

        System.out.println("tailMap: " + map.tailMap(102, true));

        System.out.println("subMap: " + map.subMap(100, false, 103, true));

        System.out.println("ceilingKey: " + map.ceilingKey(103));

        System.out.println("floorKey: " + map.floorKey(102));

    }
}
