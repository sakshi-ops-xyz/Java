package multithreading.differenceCasesOfThreadExecution;

// Single task from single thread
public class Case1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1 Running");
    }

    public static void main(String[] args) {
        Case1 a=new Case1();
        a.start();
    }
}
