package Inheritance;

class Employee{
    int salary=10000;
}

public class Programmer extends Employee {
    int bonus=salary*(40/100);
    
    public static void main(String[] args) {
        Programmer p= new Programmer();
        p.salary=72380;
        System.out.println(p.salary);
        System.out.println(p.bonus);
    }
}
