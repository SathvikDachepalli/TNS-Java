package apr20.AccessModifiers;

public class PrivateTest {
    private int a=10;
    private void msg(){
        System.out.println("Value of a is: "+ this.a);
    }
    void testMsg(){
        msg();
    }
}
