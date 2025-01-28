package multithreadingExecuterFramework.executorInterfaceEg;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Executor interface implementing tasks, using thread pool (using executors class)
public class Class2 {
    public static void main(String[] args) {
//        Executor executor=Executors.newFixedThreadPool(4);
//        Executor executor=Executors.newCachedThreadPool();
//        Executor executor=Executors.newSingleThreadExecutor();
        Executor executor=Executors.newScheduledThreadPool(2);



        for(int i=0; i<8; i++) {
            int taskId=i;
            executor.execute(() -> {
                System.out.println("Task Id: "+taskId+" Current Thread: "+Thread.currentThread().getName());
            });
        }

    }
}
