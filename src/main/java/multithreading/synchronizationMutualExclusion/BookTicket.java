package multithreading.synchronizationMutualExclusion;

public class BookTicket {
    private int tickets = 10;

    // Non-synchronized method (deliberately)
    public synchronized void bookTicket(int x) {

        // synchronized (this) {
        if (x <= tickets) {
            try {
                // Simulating a delay to increase the chance of a race condition
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets = tickets - x;
            System.out.println(Thread.currentThread().getName() + " booked " + x + " tickets, only " + tickets + " left.");
        } else {
            System.out.println(Thread.currentThread().getName() + " wanted to book " + x + " tickets, but only " + tickets + " left.");
        }
       //  }
    }
}

class MyTask extends Thread {
    static private BookTicket b;
    private int val;

    public MyTask(int val) {
        this.val = val;
    }

    @Override
    public void run() {
        b.bookTicket(this.val);
    }

    public static void main(String[] args) {
        b = new BookTicket();

        MyTask m1 = new MyTask(7);
        m1.setName("Thread-1");
        m1.start();

        MyTask m2 = new MyTask(5);
        m2.setName("Thread-2");
        m2.start();
    }
}
