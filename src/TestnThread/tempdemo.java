package TestnThread;

public class tempdemo implements Runnable
{
        public void run(){
            for(int i = 0; i < 5; i++){
                System.out.println("hello");
            }
        }
    
        public static void main(String[] args)
        {
            tempdemo r = new tempdemo();
            Thread t = new Thread(r);
            t.start();
        }
}
