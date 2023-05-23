package CollectionFrameworks;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Potato");
        list.add("Tomato");
        list.add("Brinjal");

        System.out.println(list);

        // Converting Array to list

        String [] lanArr={"Java","Python","C","C++",".Net","PHP"};
        System.out.println(lanArr);
        for(String language: lanArr){
            System.out.println(language);
        }
        
        String lanString=Arrays.toString(lanArr);
        System.out.println(lanString);

        List<String> lanList=new ArrayList<String>();
        for(String language : lanArr){
            lanList.add(language);
        }
        System.out.println(lanList);
    }
}
