package TestnThread;

public class DualThread extends Thread{
    public void run(){
        try{
            System.out.println("Running");
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        DualThread t1= new DualThread();
        t1.start();
        
        t1.start();      // same thread cannot be called at once.   
    }
}
