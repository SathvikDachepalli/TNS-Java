package TestnThread;

public class PriorityCheck extends Thread{
    public void run() {
        Thread curr= Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(curr.getName()+"  "+curr.getPriority()+" "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }    
    public static void main(String[] args) throws InterruptedException{
        PriorityCheck p1=new PriorityCheck();
        PriorityCheck p2=new PriorityCheck();
        PriorityCheck p3=new PriorityCheck();

        System.out.println("Main Thread current Priority " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        
        p1.setPriority(2);
        p2.setPriority(6);
        p3.setPriority(8);

        p1.start();
        p2.start();
        p3.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Priority of the main Thread is " +Thread.currentThread().getPriority());
        }
    }
}
