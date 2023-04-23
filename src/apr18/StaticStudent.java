package apr18;

class Student{
    int rollno;
    String name;
    static String college="IIT";
    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    };
    static{
        System.out.println("Welcome to "+college+"!");
    }
    void display(){
        System.out.println("Welcome "+name+" "+college);
        System.out.println("Your rollno is "+rollno);
    };
    static void change(String college){
        System.out.println("College name changed from "+Student.college+" to "+college+".");
        Student.college=college;
        
    }
}

public class StaticStudent {
    public static void main(String[] args) {
        Student s1=new Student(1,"Rahul");
        Student s2=new Student(2,"Raj");
        s1.display();
        s2.display();
        Student.change("Sreyas");
        s1.display();
        s2.display();
    }
}
