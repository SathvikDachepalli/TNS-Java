package Abstraction;
/*
 * When we cannot define which developer would work on the language and we cannot define it rn. So we create the method as abstract followed by changing the class to abstract
 */
abstract class Programming{
   public abstract void developer();
}

class FullStackDev extends Programming{
    public void developer(){
        System.out.println("FullStackDev.developer() : ");
        System.out.print("I Code in React JS, Java / Python and in Node JS");
    }
    void father(){
        System.out.println("Tim Berner Lee");
    }
}

class Java extends Programming{
    public void developer(){
        System.out.println("Java.developer() : ");
        System.out.println("I code in Java only.");
    }
    void father(){
        System.out.println("James Gosling ");
    }
}


public class AnotherEx {
    public static void main(String[] args) {
        
    }
}
