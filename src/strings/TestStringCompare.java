package strings;

public class TestStringCompare {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3=new String("java");
        String s4="Python";
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s3); // false
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1==s4); // false
        System.out.println(s1.equals(s4)); // false

        String s5="JAVA";
        System.out.println(s1==s5); // false
        System.out.println(s1.equals(s5)); // false
        System.out.println(s1.equalsIgnoreCase(s5)); // true

    }
}
