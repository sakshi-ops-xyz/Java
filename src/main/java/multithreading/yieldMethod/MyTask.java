package multithreading.yieldMethod;

public class MyTask extends Thread{
    Integer i;
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
    public static void main(String[] args) throws Exception {
        MyTask m=new MyTask();
        m.start();

        // Yield method
        Thread.yield();

        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()+" :: "+i);
        }

        // Interrupt methods
    }
}

