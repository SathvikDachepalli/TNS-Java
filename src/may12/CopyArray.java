package may12;
import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        int size=0,i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        size=sc.nextInt();
        int a[]=new int[size],b[]=new int[size];
        System.out.println("Enter element variables");
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        System.out.println("Different array");
        
    }
}
