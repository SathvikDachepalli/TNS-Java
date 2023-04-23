package apr13;

class StatsTest{
    
    static int x=10;
    int y=100;
    public void method1() {
        System.out.println("Public method check");
    }
    static void method2(){    //Static methods exists only in class, which can be a static member variable or a data function.
        System.out.println("Static Method Check");
    }
}


public class statDemo {

    public static void main(String[] args) {
        StatsTest obj = new StatsTest();
        obj.method1();
        StatsTest.x=100;
        //obj.x=100; // This is kind of possible, as x is a static variable.
        obj.y=20;

        System.out.println(StatsTest.x+"     "+obj.y);


        StatsTest.method2(); // Correct way to access a static variable.
        // obj.method2(); // No need to use any object to access it.
        // statDemo.method1(); // This doesnt work like static.
    }
}
// Static method will never take memory, simillarly like class.
//If it is not static, we need to create an instance(Obj) to access the method or variable.