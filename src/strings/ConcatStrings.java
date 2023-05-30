package strings;

public class ConcatStrings {
    public static void main(String[] args) {
        String s="Java";
        System.out.println(s);
        String c="Core "+s;
        System.out.println(c);
        String d="Advanced";
        d=d.concat(" "+c);
        System.out.println(d);

        String p="Peter";
        String q=p.concat(" Parker");
        System.out.println(q);
    }
}
