package TestnThread;

public class temp implements Runnable
{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("hello");
        }
    }

    public static void main(String[] args)
    {
        temp r = new temp();
        Thread t = new Thread(r);
        t.start();
    }
}