package Constructor;

/*
 * The main purpose of constructor is to initialize the object. 
 * Every java class has a constructor, even if you dont specify it.
 * A constructor is automatically called at the time of object creation.
 * Example: A obj=new A(); here new A() is a constructor which is defined by default
 * Constructor never return any return type including void.
 * 
 * 
 *  Syntax:
 *      <access_modifier> class <class_name>{
 *           <class_name>(){
 *              // constructor body
 *            } // This is a constructor
 *           <access_modifier> <return_type> <method_name>(<parameters>){
 *              // method body
 *          }
 *     }
 * 
 */

/*
 *  There are two types of constructors:
 *    1. Default constructor
 *    2. Parameterized constructor
 * 
 * 1. Default constructor:
 *   A constructor which is defined by default by the compiler.
 *   It has no parameters.
 *   It has no return type.
 *      Syntax:
 *         <access_modifier> class <class_name>{
 *             <class_name>(){
 *                // constructor body
 *             } // This is a constructor
 *        }
 * 
 * 2. Parameterized constructor:
 *  A constructor which is defined by the user.
 *  It has parameters.
 *  It has no return type.
 *      Syntax:
 *        <access_modifier> class <class_name>{
 *           <class_name>(<parameters>){
 *             // constructor body
 *          } // This is a constructor
 *     }
 * 
 */

class A{
    public int x;

    A(int x){
        System.out.println("Value passed to constructor "+x);
        this.x=x;
    }
    A(){   
        // This is a constructor. It can't return a value.
        
        System.out.println("I am a default constructor ");
        System.out.print("Initializing var x as 0");
        this.x=0;
        // return 10; // error: constructor cannot return a value
    }
    void show(){
        System.out.println("Value of x is "+x);

    }; // This is a normal method. It can return a value.    
}

class ClassEx{
    public int x,y;
    public String name;
    public Boolean isDefault;
    ClassEx(){
        System.out.println("I am a default constructor");
        isDefault=true;
        
    }

    ClassEx(int x,int y,String name){
        this.x=x;
        this.y=y;
        this.name=name;
        isDefault=false;
    }
    void show(){
        if(isDefault){
            
            System.out.println("I am a default constructor");
            System.out.println("Value of x is "+x);
            System.out.println("Value of y is "+y);
            System.out.println("Value of name is "+name);

        }
        else{
            System.out.println("Value of x is "+x);
            System.out.println("Value of y is "+y);
            System.out.println("Value of name is "+name);
        }
    }
}

public class constructor {
    public static void main(String[] args) {
        A obj=new A();
        A obj2=new A(5);
        obj.show();
        obj2.show();
        ClassEx obj3=new ClassEx(10,20,"Hello");
        obj3.show();
    }
}
