package multithreading.threadMethods;



public class MyTask extends Thread{
    Integer i;
    @Override
    public void run() {
//        for(int i=0; i<5; i++) {
//            System.out.println(Thread.currentThread().getName() + " : " + i);
//        }
        System.out.println("Child Thread Running");
    }
    public static void main(String[] args) throws Exception {
        MyTask m=new MyTask();
        m.start();
        // name reld methods
        System.out.println("Thread name: "+Thread.currentThread().getName());
        Thread.currentThread().setName("abc");
        System.out.println("Thread name: "+Thread.currentThread().getName());  // or want to get for specific thread then: m.getName();

        // basic methods
        Thread x=m.currentThread();   // give reference of currently running thread
        System.out.println("Thread id: "+Thread.currentThread().getId());
        System.out.println("Is Alive: "+Thread.currentThread().isAlive());
        System.out.println("Get State: "+Thread.currentThread().getState());

        // Daemon methods
        MyTask n=new MyTask();
        n.setDaemon(true);        // creating a normal thread to daemon thread
        n.start();                // cannot set daemon thread after starting thread
        System.out.println("Is Deamon: "+Thread.currentThread().isDaemon());

        // methods related to priority
        System.out.println("Get Priority: "+m.getPriority());
        m.setPriority(8);


        // Sleep method
        for(int i=1; i<=5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
            sleep(10);
        }

//        // Yield method
//
//        Thread.yield();
//
//        for(int i=0; i<5; i++) {
//            System.out.println(Thread.currentThread().getName()+" :: "+i);
//        }

        // Interrupt methods
    }
}
