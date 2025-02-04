package cronExpressions.quartzScheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class Main {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        JobDetail job = JobBuilder.newJob(SimpleJob.class).build();
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?")).build();
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
        Thread.sleep(1000000);
        scheduler.shutdown();
    }
}
