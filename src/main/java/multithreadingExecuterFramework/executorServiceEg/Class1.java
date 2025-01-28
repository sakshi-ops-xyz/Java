package multithreadingExecuterFramework.executorServiceEg;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Class1 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();

        // passing runnable in submit
        executor.submit(() -> {
            System.out.println("Task running");
        });

        // getting results in Future object
        Future<?> f=executor.submit(() -> {
            throw new Exception();
        });

        try {
            f.get();
        }catch (Exception e) {
            System.out.println(e);
        }

        // passing callable in submit
        Callable<?> c=(() -> {
            sleep(1000);
            return 2+4;
        });

        Future<?> f2=executor.submit(c);

        try {
            System.out.println(f2.get());
        } catch (Exception e) {
            System.out.println(e);
        }

        executor.shutdown();
    }
}
