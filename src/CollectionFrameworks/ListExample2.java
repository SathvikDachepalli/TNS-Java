package CollectionFrameworks;

import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hardware & Networking");  //0
        list.add("Tally");                  //1
        list.add("MS Office");              //2
        list.add("UI/UX");                  //3
        list.add("Web Designing");          //4

        System.out.println("Returning Elements : "+list.get(1));
        list.set(1,"SAP");
        for(String course : list){
            System.out.println(course);
        }
    }    
}
