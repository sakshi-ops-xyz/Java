package multithreadingExecuterFramework.executorServiceEg;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Class2 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);

        for(int i=0; i<4; i++) {
            int taskId=i;
            Callable<?> callable=(() -> {
                try {
                    sleep(1000);
                    return "Current task: "+taskId+" Executed by: "+Thread.currentThread().getName();
                } catch (Exception e) {
                    return e;
                }
            });
            Future<?> f=executor.submit(callable);
            try {
                System.out.println(f.get());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        executor.shutdown();
    }
}
