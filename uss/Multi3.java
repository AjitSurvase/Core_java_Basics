package uss;

public class Multi3 implements Runnable{
    @Override
    public void run() {
        System.out.println("my Thread is Running..");
    }

    public static void main(String[] args) {
        Multi3 m1=new Multi3();
        Thread t1=new Thread(m1);//using constructor
        //Thread(runnable);
        t1.start();
    }


}
