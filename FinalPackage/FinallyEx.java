package FinalPackage;

import java.util.Scanner;

public class FinallyEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Inside try block and trying to divide with 0");

            int data=sc.nextInt()/sc.nextInt();
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Exception handled");
            System.out.println(e);
        }
        finally{
            sc.close();
            System.out.println("Final block");
            System.out.println("Thank you.");
        }
    }
}
