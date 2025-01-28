package multithreadingExecuterFramework.futureClassEg;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Class1 {
    public static void main(String[] args) {
        Callable<Integer> callable=(()-> {
            int sum=0;
            for(int i=0; i<10000; i++) {
                sum+=1;
            }
            return sum;
        });

        Future<?> f=new FutureTask<>(callable);

        Thread t=new Thread((Runnable)f);
        t.start();

        try {
            var result=f.get();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(f.isDone());
        System.out.println(f.isCancelled());

    }
}
