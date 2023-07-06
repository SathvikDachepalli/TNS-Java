package Inheritance;

class Animal2{
    void Eat(){
        System.out.println("Eating");
    }
}
class Dog2 extends Animal2{
    void Bark(){
        System.out.println("Barking");
    }
}

class Cat2 extends Animal2{
    void Meow(){
        System.out.println("Meowing");
    }
}

public class ExHeirInherit {
    public static void main(String[] args) {
        Cat2 c= new Cat2();
        c.Eat();
        c.Meow();
        Dog2 d= new Dog2();
        d.Eat();
        d.Bark();
    }
}
