package multithreadingExecuterFramework.scheduledExectorServiceEg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(2);

        // runnable, time, unit
        executor.schedule(() -> {
            System.out.println("Task executed after delay");
        }, 5, TimeUnit.SECONDS); // Executes the task after 5 seconds

        // Scheduling a task 2 run repeatedly at fix rate (every 3 seconds)
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Task executed at fixed-rate");
        }, 0, 3, TimeUnit.SECONDS);


        for(int i=0; i<4; i++) {
            int taskId=i;
            executor.execute(() -> {
                System.out.println("Task Id: "+taskId+" Current Thread: "+Thread.currentThread().getName());

            });
        }

        executor.shutdown();
    }
}
