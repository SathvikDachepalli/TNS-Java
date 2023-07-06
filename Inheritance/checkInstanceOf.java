package Inheritance;
class Person{
    void display(){
        System.out.println("I am a person");
    }
}
class Student extends Person{
    void display(){
        System.out.println("I am a student");
    }
}
public class checkInstanceOf {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        if(p instanceof Person){
            System.out.println("p is an instance of Person");
        }
        if(s instanceof Student){
            System.out.println("s is an instance of Student");
        }
        if(s instanceof Person){
            System.out.println("s is an instance of Person");
        }
        if(p instanceof Student){
            System.out.println("p is an instance of Student");
        }
    }
}
