package TestnThread;

public class MultiTask extends Thread{
    public void run(){
        System.out.println("Task one");
    }
    public static void main(String[] args) {
        MultiTask t1= new MultiTask();
        MultiTask t2= new MultiTask();
        MultiTask t3= new MultiTask();

        t1.start();
        t2.start();
        t3.start();
    }
}
