package Generics;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(10);
        list.add("Hello");
        System.out.println("Non Generic List");
        for (Object a : list) {
            System.out.println(a);
        }

        System.out.println("Generic List");
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        //list1.add("Hello"); // Compile time error

        // for (Object a : list1) {
        //     System.out.println(a);
        // }

        Iterator<Integer> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
