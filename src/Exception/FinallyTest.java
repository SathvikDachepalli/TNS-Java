package Exception;

import java.util.Scanner;

public class FinallyTest {
    /*
     * Own question
     * Create a calculator which says goodbye at finally if there is an exception which might be handled or not.
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a value: ");
            int
             a=sc.nextInt();
            System.out.println("Enter b value: ");
            int b=sc.nextInt();

            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Looks like you divided 0 by 0..");
        }
        finally{
            sc.close();
            System.out.println("Good bye :D");
        }
    }
}
