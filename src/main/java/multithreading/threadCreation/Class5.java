package multithreading.threadCreation;

// Lambda function
public class Class5 {
    public static void main(String[] args) {

        // for loop for multiple threads
        for(int i=0; i<4; i++) {

            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " is running.");
            });
            t.start();

        }
    }
}
