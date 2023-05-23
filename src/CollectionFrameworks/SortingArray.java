package CollectionFrameworks;

import java.util.*;

public class SortingArray {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mumbai");
        list.add("Nashik");
        list.add("Hyderabad");
        list.add("Goa");
        list.add("Gangotri");

        System.out.println(list);

        Collections.sort(list);
        
        System.out.println(list);

        List<Integer> list1=new ArrayList<Integer>();
        list1.add(101);
        list1.add(204);
        list1.add(111);
        list1.add(102);
        list1.add(100);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        for (Integer number:list1){
            System.out.println(number);
        }
        
    }
}
