package TestnThread;

public class TStringDemo {
    public static void main(String[] args) {
        Thread t1=new Thread("Thread 1");
        
        t1.start();
        System.out.println(t1.getName());
    }
}
