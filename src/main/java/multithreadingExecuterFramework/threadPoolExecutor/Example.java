package multithreadingExecuterFramework.threadPoolExecutor;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Example {

    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2, 4, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());

        for(int i=1; i<=6; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    sleep(1000L);
                    System.out.println("Task id: "+ taskId + " Name: "+Thread.currentThread().getName());
                } catch(InterruptedException e){
                    System.out.println(e);
                }
            });
        }

        executor.shutdown();

    }

}


//class DefaultThreadFactory extends ThreadFactory {
//    @Override
////    public TH
//
//}