package strings;

public class IndexOfEx {
    public static void main(String[] args) {
        String str="Java Full stack is a good course";
        System.out.println(str.indexOf("good"));
        System.out.println(str.indexOf("course"));
        System.out.println(str.indexOf("hello"));

        String s1="This is IndexOf method";
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("IndexOf");
        System.out.println(index1+"  "+index2);

    }
}
