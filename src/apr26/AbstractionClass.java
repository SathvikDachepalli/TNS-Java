package apr26;
abstract class Animal{
    public abstract void sound();
    final void eat(){System.out.println("Animal.eat() final: eating");};
    static void sit(){System.out.println("Animal.sit() static : I can Sit");};
    void stand(){};
}

class Dog extends Animal{
    
    public void sound(){ // If it is an abstract method, then it must be implemented in the child class. Access modifier of the method must be same.
        System.out.println("Dog.sound() : Bouh!");
    }
    //void sit(){ // static methods and final methods cannot be inherited and must be defined in the class.
    //}
    void stand(){
        System.out.println("Dog.stand() : I can stand");
    }
}

class Lion extends Animal{
    public void sound(){
        System.out.println("Lion.sound() : ROAR!!");
    }
    public void stand(){
        System.out.println("Lion.stand() : I cannot stand");
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        // Animal x = new Animal();  // Cannot Instantiate Animal object.
        Lion lion = new Lion();
        lion.eat();
        lion.sound();
        lion.stand();
        Lion.sit();

        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.stand();
        dog.sit();

        Animal l= new Lion();
    }
}
