package strings;

public class StringLiteralDemo {
    public static void main(String[] args) {
        String a="Java";
        System.out.println(a);

        String b="Java";
        System.out.println(b);

        a.concat(" Programming"); // concat doesnt work. Java Strings are immutable
        System.out.println("a:"+a);
        a=a.concat(" Programming"); // Will work now, coz we are assigning the new value to a
        System.out.println("a:"+a);
        b=b.concat(" Course");
        System.out.println("b:"+b);
    }    
}
