package TestnThread;

public class TDemo extends Thread {
    public void run() {
        System.out.println("Thread is started.");
    }
    public static void main(String[] args) {
        TDemo obj=new TDemo();
        obj.start(); // start makes void run method to begin executing.
        for(int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
}
