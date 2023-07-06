package TestnThread;

public class ThreadName extends Thread{
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        ThreadName obj=new ThreadName();
        System.out.println("name of the thread: "+obj.getName());
        obj.start();
        obj.setName("Sathvik");
        System.out.println("After changing name of the thread: "+ obj.getName());
    }
}
