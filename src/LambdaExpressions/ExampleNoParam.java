package LambdaExpressions;

@FunctionalInterface
interface sayable {
    public String say();
}
public class ExampleNoParam {
    public static void main(String[] args) {
        sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
