package LambdaExpressions;
interface SingleParam {
    public String say(String name);
}
public class SingleParameter {
    public static void main(String[] args) {
        SingleParam s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Amanda"));

        SingleParam s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("John"));
    }
}
