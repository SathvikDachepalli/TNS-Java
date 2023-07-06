package TestnThread;

public class ThreadGroupDemo implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }    
    public static void main(String[] args) {
        ThreadGroupDemo runnable=new ThreadGroupDemo();
        ThreadGroup tg1=new ThreadGroup("Parent");

        Thread t1= new Thread(tg1,runnable, "One");
        t1.start();

        Thread t2= new Thread(tg1,runnable, "Two");
        t2.start();

        Thread t3= new Thread(tg1,runnable, "Three");
        t3.start();
        
        ThreadGroup tg2 = new ThreadGroup(tg1,"Child");
        Thread a= new Thread(tg2, runnable, "A");
        a.start();
        
        Thread b= new Thread(tg2, runnable, "B");
        b.start();
        
        Thread c= new Thread(tg2, runnable, "C");
        c.start();
        
        System.out.println("Thread group name: "+tg1.getName());
        tg1.list();

        System.out.println("Thread group name: "+tg2.getName());
        tg2.list();
        
    }
}
