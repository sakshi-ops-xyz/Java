import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.lang.Thread.sleep;

public class Class {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        ExecutorService executorService1=Executors.newSingleThreadExecutor();
        ExecutorService executorService2=Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(10);
        ExecutorService executorService3=Executors.newScheduledThreadPool(2);

        for(int i=0; i<5; i++) {
            int taskId=i;
            executorService.execute(() -> {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task"+taskId+" running by thread"+Thread.currentThread().getName());
            });
        }



        for(int i=0; i<5; i++) {
            int taskId=i;
            executorService1.execute(() -> {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task"+taskId+" running by thread"+Thread.currentThread().getName());
            });
        }


        for(int i=0; i<5; i++) {
            int taskId=i;
            executorService2.execute(() -> {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task"+taskId+" running by thread"+Thread.currentThread().getName());
            });
        }


        for(int i=0; i<5; i++) {
            int taskId=i;
            executorService3.execute(() -> {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task"+taskId+" running by thread"+Thread.currentThread().getName());
            });
        }


        for(int i=0; i<5; i++) {
            int taskId=i;
            scheduledExecutorService.execute(() -> {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task"+taskId+" running by thread"+Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
        executorService1.shutdown();
        executorService2.shutdown();
        executorService3.shutdown();
        scheduledExecutorService.shutdown();


    }
}
