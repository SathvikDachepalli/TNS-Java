package CollectionFrameworks.ArrayListEXs;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> Bikes=new ArrayList<String>();
        Bikes.add("Royal Enfield");
        Bikes.add("Avenger");
        Bikes.add("BMW");
        Bikes.add("Jawa");
        // System.out.println(Bikes); // List elements are printed [Royal Enfield, Avenger, BMW, Jawa]
        Iterator <String> itr=Bikes.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("\n New Element \n Using ForEach");
        Bikes.add("KTM");
        System.out.println();
        for(String bike : Bikes){
            System.out.println(bike);
        }

        while(itr.hasNext()){ // Wont work because of concurrent modification.
            System.out.println(itr.next());
        }
    }    
}
