package Inheritance;

class Employees{
    int salary=50000;
    void work(){
        System.out.println("Default work in the office");
    }
    int bonus(int salary){
        return salary*30/100;
    }
}

class Coder extends Employees{
    int salary=100000;
    void work(){
        System.out.println("I code daily!");
    }
}

public class MethodOverRide {
    public static void main(String[] args) {
        Coder c = new Coder();
        System.out.println(c.salary);
        System.out.println(c.bonus(c.salary));
        c.work();
    }    
}
