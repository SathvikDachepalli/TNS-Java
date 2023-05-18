package FinalPackage;

public class FinalEx {
    final int age=19;
    final String college = "_____ College";
    void display(){
        // age=55; // Java.lang.error Which is a compile time error.
    } 
    public static void main(String[] args) {
        FinalEx ex= new FinalEx();
        try {
            ex.display();
        } catch (Exception e) {
            System.out.println("Dosen't work");
        }
        finally{
            System.out.println(ex.age+" is initialized with final and cannot be changed");
        }
    }
}
