package TestnThread;

public class DaemonDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() +"  is working");
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread DETECTED");
        }
    }
    public static void main(String[] args) {
        DaemonDemo d1 = new DaemonDemo();
        DaemonDemo d2 = new DaemonDemo();
        DaemonDemo d3 = new DaemonDemo();

        d1.setDaemon(true);
        d2.setDaemon(false);
        d3.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
    }
}
