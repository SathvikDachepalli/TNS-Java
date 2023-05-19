package TestnThread;
// May 19

import java.util.ArrayList;

class Table{
   public ArrayList <Integer> printTable(int n){
    ArrayList <Integer> Arr=new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
            Arr.add(n*i);
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        return Arr;
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    @Override
    public void run() {
        t.printTable(8);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    @Override
    public void run() {
        t.printTable(9);
    }
}
public class NoSyncDemo {
    public static void main(String[] args) {
        Table obj= new Table();
        Thread1 t1= new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();


    }
}
