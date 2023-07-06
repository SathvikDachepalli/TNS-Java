package Inheritance;
class Animal1{
    void eat(){
        System.out.println("Eating");
    }
}
class Cat1 extends Animal1{
    void bark(){
        System.out.println("Meow :3");
    }
}
public class ExSimInherit {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
        c.eat();
        c.bark();
    }
}
