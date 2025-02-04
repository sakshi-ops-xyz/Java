import static java.lang.Thread.sleep;

public class test implements Runnable{
    private static volatile int count=0;

    public synchronized int counter() {
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
//        count+=1;
            return count++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+" "+this.counter());
        }};

    public static void main(String[] args) throws InterruptedException {

    test x1=new test();
    test x2=new test();

    Thread t1=new Thread(x1);
    t1.start();

    sleep(1000);

    Thread t2=new Thread(x2);
    t2.start();
    }
}
