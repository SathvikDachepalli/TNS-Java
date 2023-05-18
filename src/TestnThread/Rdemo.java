package TestnThread;

public class Rdemo implements Runnable{
    public void run() { // This need to be initialized
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Rdemo obj=new Rdemo();
        Thread t1=new Thread(obj);// You need to initialize Thread class 
        t1.start();
    }
}
