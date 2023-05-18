package TestnThread;

public class CurrentThreadCheck extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            
            System.out.println(Thread.currentThread().getName() +" " +i);
        }
    }
    public static void main(String[] args) {
        CurrentThreadCheck t1= new CurrentThreadCheck();
        CurrentThreadCheck t2= new CurrentThreadCheck();
        t1.start();
        t2.start();
    }
}
