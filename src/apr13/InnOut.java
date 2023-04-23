package apr13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
 *  To take input from the user you can do it by 
 *  1. Scanner Class. ( Predefined ) in java.util package.
 *      - Scanner obj_name = new Scanner(System.in);
 *      - Methods:
 *          nextInt(); - int
 *          nextLine(); - String
 *          nextFloat(); - Float
 *          nextBoolean(); - True or False
 *          nextDouble(); -  Double
 *      - Use import java.util.Scanner;
 *      - If WRONG INPUT is given in the time of fetching the value. We can get an Exception.
 *          - if at the time of nextFloat() -> You entered a String -> ERROR!
 *      
 * 
 *  2. BufferedReader class in java.io.BufferedReader package. and InputStreamReader in java.io.InputStreamReader package.
 *      - BufferedReader obj_name = new BufferedReader(new InputStreamReader(System.in));
 *      - Methods:
 *          readLine(); - String
 *          read(); - int
 *          read(char[]); - char[]
 *      - Use import java.io.BufferedReader; and import java.io.InputStreamReader;
 *      - If WRONG INPUT is given in the time of fetching the value. We can get an Exception.
 *      - if at the time of read() -> You entered a String -> ERROR!
 */

 /* 
    For output we have 4 ways:
    1. System.out.println();
    2. System.out.print();
    3. System.out.printf();
    4. System.out.format();

    But we will use only 2 ways:
    1. System.out.println();
    2. System.out.printf();

  */
public class InnOut {
    public static void main(String[] args) throws IOException {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of int: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of Boolean: ");
        boolean b= sc.nextBoolean();
        System.out.println("Enter the value of char: ");
        char c= sc.next().charAt(0);
        System.out.println("Enter the value of double: ");
        double d =sc.nextDouble();
        System.out.println("Enter the value of float: ");
        float f = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the value of String: ");
        String str= sc.nextLine();

        System.out.println( "Scanner");

        System.out.println("int: "+a);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("boolean: "+b);
        System.out.println("char: "+c);
        System.out.println("String: "+str);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of int: ");
        a=br.read();
        System.out.println("Enter the value of String: ");
        str= br.readLine();

        System.out.println("Buffered Reader");

        System.out.println("int: "+a);
        System.out.println("String: "+str);

        br.close();
        sc.close();
    }
}
