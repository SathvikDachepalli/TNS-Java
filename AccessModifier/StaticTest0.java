package AccessModifier;

public class StaticTest0 {
    static int a=10;
    public int x=100;
    static void display(){
        System.out.println("a="+a);
    }
    static {
        System.out.println("Static block is invoked");
    }
    public static void main(String[] args) {
        System.out.println("Main method invoked");
        display();
        System.out.println(a);
        //System.out.println(x); //Cannot make a static reference to the non-static field x
        StaticTest0 st=new StaticTest0();
        System.out.println(st.x);
    }
}
