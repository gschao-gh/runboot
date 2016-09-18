package com.el.quartz;

import com.el.quartz.taskjob.MyTaskJob;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by Administrator on 2016/9/14.
 */
public class QuartzTest {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        try {
            logger.warn("Grab the Scheduler instance from the Factory");
            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
         /*   JobDetail job = newJob(MyTaskJob.class)
                    .withIdentity("job1", "group1")
                    .build();*/

            // Trigger the job to run now, and then repeat every 40 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInSeconds(10)
                            .repeatForever())
                    .build();

            // Tell quartz to schedule the job using our trigger
//            scheduler.scheduleJob(job, trigger);
            // and start it off
            scheduler.start();
//            scheduler.shutdown();

        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}
