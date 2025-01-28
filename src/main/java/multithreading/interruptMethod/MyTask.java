package multithreading.interruptMethod;

public class MyTask extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
                return;
            }
            System.out.println("Child thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask t = new MyTask();
        t.start();
        t.interrupt(); // Interrupt the child thread
        System.out.println("Is child thread interrupted? " + t.isInterrupted());
        System.out.println("Is child thread interrupted? " + interrupted());

    }
}
