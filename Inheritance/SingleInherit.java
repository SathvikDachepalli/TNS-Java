package Inheritance;

class Student{
    int rollno,marks;  // If it is private we get a compilation error. If we use protected then we can only inherit to the immediate class

    String name;
    void input(){    // Same with the methods
        System.out.println("Enter rollno, name and marks");
    }
}
class Test extends Student{
    void display(){
        rollno=20;
        marks=99;
        name="Tom";
        System.out.println(rollno +" " +name+" "+marks);
    }
}


public class SingleInherit {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.input();
        obj.display();
    }
}
