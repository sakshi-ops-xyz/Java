package multithreading.threadCreation;

public class Class1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Class1 c=new Class1();
        c.start();
        c.start();
    }
}
