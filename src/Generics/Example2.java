package Generics;
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Hello");
        map.put(2,"World");
        map.put(3,"Java");
        //map.put(4,10); // Compile time error

        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    }
}
