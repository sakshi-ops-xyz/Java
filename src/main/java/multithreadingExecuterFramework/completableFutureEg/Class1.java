package multithreadingExecuterFramework.completableFutureEg;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Class1{

    public static void main(String[] args) {

        // 1. Non-blocking methods
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(result -> result + " World!") // Transform the result
                .thenAccept(System.out::println) // Consume the result
                .thenRun(() -> System.out.println("Non-blocking task complete!")); // Run an action

        // 2. Composing multiple asynchronous methods
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Task 1");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Task 2");

        // thenCompose: Sequential chaining
        future1.thenCompose(result -> CompletableFuture.supplyAsync(() -> result + " + Task 3"))
                .thenAccept(System.out::println);

        // thenCombine: Combine two results
        future1.thenCombine(future2, (result1, result2) -> result1 + " & " + result2)
                .thenAccept(System.out::println);

        // allOf: Wait for all to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2);
        allFutures.thenRun(() -> System.out.println("All tasks completed!"));

        // anyOf: Wait for any one to complete
        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1, future2);
        anyFuture.thenAccept(result -> System.out.println("First completed: " + result));

        // 3. Exception handling
        CompletableFuture.supplyAsync(() -> {
                    if (true) throw new RuntimeException("Something went wrong!");
                    return "Success";
                })
                .exceptionally(ex -> "Handled Exception: " + ex.getMessage()) // Handle exception
                .thenAccept(System.out::println);

        CompletableFuture.supplyAsync(() -> "Normal Task")
                .handle((result, ex) -> {
                    if (ex != null) return "Error occurred: " + ex.getMessage();
                    return "Result: " + result;
                })
                .thenAccept(System.out::println);

        // 4. Completion methods
        CompletableFuture<String> manualCompletion = new CompletableFuture<>();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                manualCompletion.complete("Manually Completed!");
            } catch (InterruptedException e) {
                manualCompletion.completeExceptionally(e);
            }
        }).start();

        manualCompletion.thenAccept(System.out::println);

        // 5. Synchronous vs Asynchronous
        CompletableFuture.supplyAsync(() -> "Async Task")
                .thenApplyAsync(result -> result + " processed asynchronously")
                .thenAcceptAsync(System.out::println);

        // 6. Utility methods
        CompletableFuture<String> preCompleted = CompletableFuture.completedFuture("Pre-completed Future");
        System.out.println(preCompleted.join()); // Get result immediately

        CompletableFuture<Void> asyncRun = CompletableFuture.runAsync(() -> System.out.println("Run async task"));

        // 7. Delayed execution
        CompletableFuture<String> delayedFuture = CompletableFuture.supplyAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Delayed Task";
                }).orTimeout(2, TimeUnit.SECONDS)
                .exceptionally(ex -> "Timed out: " + ex.getMessage());

        delayedFuture.thenAccept(System.out::println);

        CompletableFuture<String> timeoutComplete = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task completed!";
        }).completeOnTimeout("Default Value", 2, TimeUnit.SECONDS);

        timeoutComplete.thenAccept(System.out::println);

        // Wait for async tasks to complete
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
