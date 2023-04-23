package apr18;

class demo{
    static int a=10;
    public int b=80;
    static void display(){
        System.out.println("a="+a);
    }
    static {
        System.out.println("Static block is invoked");
    }
}

public class StaticTest1 {
    
    public static void main(String[] args) {
        System.out.println("Main method invoked");
        demo.display();
        System.out.println(demo.a);
        demo d=new demo();
        System.out.println(d.b);
    }
}
