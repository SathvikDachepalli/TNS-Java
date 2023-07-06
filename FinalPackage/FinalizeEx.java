package FinalPackage;

public class FinalizeEx{
    public static void main(String[] args) throws Throwable {
        FinalizeEx obj= new FinalizeEx();
        System.out.println(obj.hashCode());
        obj=null; // Garbage collection will be called
        System.gc(); // When gc is invoked, finalize method will be called after this.
        System.out.println("End of garbage collection");
    }
    protected void finalize() throws Throwable{
        System.out.println("Garbage collection called");
        System.out.println("Object garbage collected : "+this);
    }
}