package multithreading.threadCreation;

// 1. implements runnable
public class Class2 implements Runnable{
    // 2. override run() method
    @Override
    public void run() {
        System.out.println("Thread Running");
    }


    public static void main(String[] args) {
        // 3. Creating obj of class
        Class2 c=new Class2();
        // 4. Create of class thread and pass ref of obj
        Thread t=new Thread(c);
        // 5. Call start method
        t.start();
    }
}
