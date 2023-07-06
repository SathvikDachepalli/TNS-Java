package Arrays;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("row "+(i+1));
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
