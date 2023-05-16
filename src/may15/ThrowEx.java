package may15;

public class ThrowEx {
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Access Denied - you must be over 18");
        }
        else{
            System.out.println("Welcome!");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
