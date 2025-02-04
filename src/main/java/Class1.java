import static java.lang.Thread.sleep;

class A {
    private int x=1;
    public synchronized void method1() throws InterruptedException {
        if(x%2==0) {
            wait();
        }
        notify();
        System.out.println(Thread.currentThread().getName()+" "+x++);
    }

    public synchronized void method2() throws InterruptedException {
        if(x%2!=0) {
            wait();
        }
        notify();
        System.out.println(Thread.currentThread().getName()+" "+x++);
    }
}

public class Class1 {
    static A a=new A();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    try {
                        a.method1();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                try {
                    a.method2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            }
        });
        thread2.start();
        thread1.start();

//        System.out.println("Main thread");

    }
}
