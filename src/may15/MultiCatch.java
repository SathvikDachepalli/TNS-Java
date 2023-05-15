package may15;


public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int [5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic Exception occured. ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundsException. ");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
