//package cronExpressions.quartzScheduler;
//
//
//import static java.lang.Thread.sleep;
//
//public class Task implements Job {
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println("Quartz job running at "+java.time.LocalTime.now());
//    }
//}
//
//class Class1 {
//    public static void main(String[] args) throws SchedulerException {
//
//        // Step 1: create the job detail
//        JobDetail job= JobBuilder
//                .newJob(Task.class)
//                .withIdentity("Task", "Group")
//                .build();
//
//        // Step 2: create trigger
//        Trigger trigger=TriggerBuilder
//                .newTrigger()
//                .withIdentity("Trigger", "Group")
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?"))
//                .build();
//
//        // Step 3: create scheduler
//        Scheduler scheduler= StdSchedulerFactory.getDefaultScheduler();   // throws exception
//
//        // Step 4: start schduler
//        scheduler.start();
//
//        // Step 5: schedule the job
//        scheduler.scheduleJob(job, trigger);
//
//        // Step 6: Keep the Scheduler Running
////        System.out.println("Scheduler started. Press Ctrl+C to stop.");
////        try {
////            while (true) {
////                Thread.sleep(1000); // Keep the program alive
////            }
////        } catch (InterruptedException e) {
////            System.out.println("Scheduler interrupted: " + e.getMessage());
////        } finally {
////            scheduler.shutdown(); // Shutdown gracefully when interrupted
////        }
//
//    }
//}
