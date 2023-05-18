package AccessModifier;

public class TestAllPrgs {
    public static void main(String[] args) {
        
        PrivateTest obj= new PrivateTest();
        // System.out.println(obj.a); // Inaccessible 
        // obj.msg(); // Not visible
        obj.testMsg(); // Defined to check whether we can retreive or not.
        

        PublicTest pub = new PublicTest();
        System.out.println(pub.a);
        pub.msg();


        DefaultTest def = new DefaultTest();
        System.out.println(def.a); // Works because we are working with in the package
        def.msg();


        ProtectedTest pro = new ProtectedTest();
        System.out.println(pro.a); // Works because this is the immediate accessible of the package
        pro.msg();
        
    }  
}
