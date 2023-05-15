package may12;
import java.util.*;
public class AddArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements in Array");
        for(int i=0;i<5;i++){ // reading the values from the user
            a[i]=sc.nextInt();
        }
        System.out.println("Values in array are:");
        for(int i=0;i<5;i++){
            System.out.println("\t"+a[i]);
            sum+=a[i];
        }
        System.out.print("Summation of all values in the array are: ");
        System.out.print(sum);
        sc.close();
    }
}
