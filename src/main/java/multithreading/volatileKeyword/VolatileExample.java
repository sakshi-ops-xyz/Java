package multithreading.volatileKeyword;

import static java.lang.Thread.sleep;

class SharedResource {
    private volatile int y;  // Volatile variable to ensure visibility across threads

    public void method1() {
        y += 5;
        System.out.println(Thread.currentThread().getName() + " - method1: " + y);
    }

    public void method2() {
        y += 2;
        System.out.println(Thread.currentThread().getName() + " - method2: " + y);
    }
}

public class VolatileExample {
    static SharedResource sharedResource = new SharedResource();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sharedResource.method1();
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sharedResource.method2();
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
