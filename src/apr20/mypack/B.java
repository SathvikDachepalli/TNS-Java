package apr20.mypack;
import apr20.packs.A; // Importing specific class
// import apr20.packs.*; // Importing all classes from the package
public class B {
    public static void main(String[] args) {
        A obj= new A();
        obj.Hello();
        apr20.packs.college college =new apr20.packs.college();
        college.Name();
    }
}
