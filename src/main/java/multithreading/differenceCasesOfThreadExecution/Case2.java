package multithreading.differenceCasesOfThreadExecution;

// performing single task from multiple thread
public class Case2 extends Thread{
    @Override
    public void run() {
        System.out.println("Task Executed By: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Case2 a=new Case2();
        a.start();
        Case2 b=new Case2();
        b.start();
    }
}

