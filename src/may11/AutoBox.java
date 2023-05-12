package may11;

public class AutoBox {
    public static void main(String[] args) {
        int a=100;
        Integer b=a; //autoboxing
        System.out.println(a+" "+b);
        Integer c=200;
        int d=c; //unboxing
        System.out.println(c+" "+d);

        Integer e=300;
        int f=300;
        System.out.println(e==f); //true
        System.out.println(e.equals(f)); //true


    }
}
