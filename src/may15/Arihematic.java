package may15;

public class Arihematic {
    public static void main(String[] args) {
        try{
            int data=10/0;
            System.out.println(data);  // This wouldnt be executed.
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("This is an example of exception.");
        // int data=10/0; //Exception in thread "main" java.lang.ArithmeticException: / by zero at may15.Demo1.main(Demo1.java:13)
    }    
}
