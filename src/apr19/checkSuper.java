package apr19;
class A{
    int a =10;
    void show(){
        System.out.println("From super class");
    }
}
public class checkSuper extends A{
    int a=10;
    void show(){
        System.out.println(super.a);
        super.show();//shows super method of the class
        System.out.println("From Derived class");
    }
    public static void main(String[] args) {
        checkSuper obj=new checkSuper();
        obj.show();
        System.out.println(obj.a);
        obj.show();
    }
}
