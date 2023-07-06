package LambdaExpressions;
import java.util.*;
public class ForEachLambdaEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Amanda");
        list.add("John");
        list.add("Lucy");
        list.add("Patrick");

        list.forEach{
            (n)->{
                System.out.println(n);
            }
        }
    }
}
