package multithreading.differenceCasesOfThreadExecution;

// Performing multiple task from multiple thread
class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1 Running");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread2 Running");
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread3 Running");
    }
}

public class Case3 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 t2=new Thread2();
        t2.start();
        Thread3 t3=new Thread3();
        t3.start();
        Thread1 t4=new Thread1();
        t4.start();
        Thread2 t5=new Thread2();
        t5.start();
    }
}
