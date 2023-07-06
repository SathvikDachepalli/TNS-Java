package TestnThread;

public class RStringDemo implements Runnable{
    public void run(){
        System.out.println("THREAD IS RUNNING!!!");
    }
    public static void main(String[] args) {
        Runnable obj=new RStringDemo();
        Thread t=new Thread(obj,"My Thread name");
        t.start();
        String str=t.getName();
        System.out.println(str);
    }
}
