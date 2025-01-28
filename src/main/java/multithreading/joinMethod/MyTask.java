package multithreading.joinMethod;

public class MyTask extends Thread {

    @Override
    public void run() {
        for(int i=0; i<3; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Child thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask t=new MyTask();
        t.start();
        t.join();
        for(int i=0; i<3; i++) {
            Thread.sleep(1000);
            System.out.println("Main thread");
        }
    }
}


