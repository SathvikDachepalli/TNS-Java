package may12;
import java.util.Scanner;

public class ArrayFromUser{
    public static void main(String[] args) {
        int size,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size=sc.nextInt();
        System.out.println("\nEnter array elements");
        int a[]=new int[size];
        for (i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("\nPrinted Array element");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}