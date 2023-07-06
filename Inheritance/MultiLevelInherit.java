package Inheritance;
class Operator1{
    int a,b;
    float c;
    // Operator1(int a,int b){ this.a=a; this.b=b; }
    void add(){
        c=a+b;
        System.out.println("Addition : " + c);
    }
    void sub(){
        c=a-b;
        System.out.println("Subtraction : "+c);
    }
}

class Operator2 extends Operator1{
    // Operator2(int a, int b){super(a, b);}
    void mul(){
        c=a*b;
        System.out.println("Multiplication : "+c);
    }
    void div(){
        try {
            c=a/b;
            System.out.println("Division : "+c);
        } catch (Exception e) {
            System.out.println("0 is not divisible");
        }
    }
}

class Operator3 extends Operator2{
    // Operator3(int a, int b){super(a, b);}
    void modulus(){
        c=a%b;
        System.out.println("Modulus : "+c);
    }
}
class Calculator extends Operator3  {
    Calculator(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Your values are "+a+" , "+b);
    }
    static{
        System.out.println("Welcome to Calculator");
    }

 }

public class MultiLevelInherit {
  public static void main(String[] args) {
    Calculator obj=new Calculator(100, 20);
    obj.add();
    obj.sub();
    obj.mul();
    obj.div();
    obj.modulus();
  }   
}
