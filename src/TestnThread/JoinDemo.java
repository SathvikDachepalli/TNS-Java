package TestnThread;

import java.util.jar.Attributes.Name;

public class JoinDemo extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0; i<3;i++){
            System.out.println(name +" "+(i+1));
        }
    }
    public static void main(String[] args) throws InterruptedException{
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();
        JoinDemo t3 = new JoinDemo();
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        String name = Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name + " "+(i+1));
        }

        t3.start();
        t3.join(); // Only after completing t2, control would go to t1,t3
        t1.start();
        t2.start();


    }
}
