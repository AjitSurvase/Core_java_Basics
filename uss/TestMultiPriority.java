package uss;

public class TestMultiPriority extends Thread{
    @Override
    public void run() {
        System.out.println("running thread name is:"+Thread.currentThread().getName());

        System.out.println("running the thread prioprity is:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        TestMultiPriority m1=new TestMultiPriority();
        TestMultiPriority m2=new TestMultiPriority();
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
