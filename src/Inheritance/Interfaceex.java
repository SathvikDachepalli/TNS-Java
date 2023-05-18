package Inheritance;

import java.util.Scanner;

interface Client{
    void input(); //public + abstract
    void output();
}

class Developer implements Client{
    String name;
    double salary;
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=sc.nextLine();

        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();

        sc.close();
    }
    public void output(){
        System.out.println("Hello your name is "+name);
        System.out.println("Your salary is "+salary);
        System.out.println("You are eligblie for bonus of "+ salary*40/100);
    }
}
public class Interfaceex {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.input();
        dev.output();
    }
}
