package may15;

public class ArrayException {
    public static void main(String[] args) {
        try {
            int a[]={0,10,20,30,40,50};
            for(int i=0;i<8;i++){
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Example of ArrayOutOfBound Exception");
    }
}
