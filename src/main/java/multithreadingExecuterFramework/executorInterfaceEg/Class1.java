package multithreadingExecuterFramework.executorInterfaceEg;
import java.util.concurrent.Executor;


// Executor interface implementing tasks, without using thread pool
public class Class1 {
    public static void main(String[] args) {

        Executor executor=new Executor() {
            @Override
            public void execute(Runnable runnable) {
                Thread t=new Thread(runnable);
                t.start();
            }
        };


        // Passing task to get executed by the thread
        executor.execute(() -> {
            System.out.println("Task 1");
        });

        for(int i=0; i<4; i++) {
            executor.execute(() -> {
                System.out.println("Task 2");
            });
        }


    }
}
