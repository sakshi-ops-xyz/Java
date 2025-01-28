package multithreading.synchronizationCooperation;
import static java.lang.Thread.sleep;
import static org.apache.commons.lang3.StringUtils.join;

public class TotalEarning extends Thread {
    int earning=0;

    @Override
    public void run() {
        synchronized (this) {
            for(int i=0; i<10; i++) {
                earning+=10;
            }
            this.notify();
        }
    }
}

class Main {
    public static void main(String[] args) throws Exception{
        TotalEarning t=new TotalEarning();
        t.start();
        synchronized (t) {
            t.wait();
        }
        System.out.println(t.earning);
    }
}