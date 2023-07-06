package TestnThread;

public class ThreadSleep extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(10);
                
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i+"  "+Thread.currentThread().getName()+" \n");
        }
    }
    public static void main(String[] args) {
        ThreadSleep t1= new ThreadSleep();
        ThreadSleep t2= new ThreadSleep();

        t1.start();
        t2.start();
    }
}
