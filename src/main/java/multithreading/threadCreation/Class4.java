package multithreading.threadCreation;


// Using anonymous class
public class Class4 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread running");
            }
        });
        t.start();
    }
}
