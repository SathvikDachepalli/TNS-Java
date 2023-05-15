package may12;

import java.util.Scanner;
// Own Program
public class MatrixManipulations {
    public int[][] setMatrix(int size){
        int a[][]=new int[size][size];
        Scanner sc=new Scanner(System.in);
        for(int row=0;row<size;row++){
            System.out.print("Row "+row);
            for (int col=0;col<size;col++ ){
                System.out.print("Col "+col+" \t ");
                a[row][col]=sc.nextInt();
            }
        }
        return a;
    }
    public void getMatrix(int a[][],int size){
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                System.out.print(a[row][col]+" \t ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int size;
        System.out.println("Enter Size of your array");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();
        MatrixManipulations mm=new MatrixManipulations();
        System.out.println("Enter values for Matrix A");
        int a[][]=new int[size][size];
        a=mm.setMatrix(size);
        System.out.println("Enter values for Matrix B");
        int b[][]=new int[size][size];
        b=mm.setMatrix(size);
        System.out.println("Matrix A");
        mm.getMatrix(a, size);
        System.out.println("Matrix B");
        mm.getMatrix(b, size);
        int c[][]=new int[size][size];
        System.out.println("Addition of both");
        for(int row=0;row<size;row++){
            for (int col=0;col<size;col++){
                c[row][col]=a[row][col]+b[row][col];
            }
        }
        mm.getMatrix(c,size);

        System.out.println("Multiplication of A and B");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                c[i][j] = 0;
                for (int k = 0; k < size; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        mm.getMatrix(c, size);
        
    }
}
