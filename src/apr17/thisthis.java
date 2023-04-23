package apr17;
// This is used to select the current class object.
public class thisthis {
    int a,b;
    thisthis(int x, int y){
        this.a = x;
        this.b = y;
    }
    void show(){
       System.out.println("Prining \"this\" of :"+this); //  Shows the class object and its address. 
    }
    public static void main(String[] args) {
        // thisthis obj = new thisthis(10,20);
        // obj.show();
        // System.out.println("Printing the object address "+obj);
        // thisthis obj2 = new thisthis(30,40);
        // obj2.show();
        // System.out.println("Printing the object address "+obj2);

        // A obj = new A(50);
        
        confuse obj1 = new confuse(20);
    }
}


// Example of this() constructor call

// Path: src\apr17\this.java


// This is used to avoid confusion between the local and instance variables.
// Variable inside the class outside the function is called instance variable.
// Variable inside the function is called local variable.
// If the local variable and instance variable have the same name then we can use "this" keyword to avoid confusion.

// example:

class A{
    int a=10;
    A(int a){
        System.out.println("Value that you want to use for a " + a);
        System.out.println("Value of instance variable a "+this.a);
    }
}

class confuse{
    int a=90;
    confuse(int a){
        a=a;
        System.out.println("From constructor "+a);
    }
    void show(){
        System.out.println("From show "+a);
    }
}   