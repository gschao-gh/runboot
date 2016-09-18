package com.el.quartz;

import com.el.quartz.taskjob.MyTaskJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/18.
 */@Service
public class MyScheduler {
    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    public void sheduleJob() throws SchedulerException {
        Scheduler scheduler  = schedulerFactoryBean.getScheduler();
        JobDetail jobDetail = JobBuilder.newJob(MyTaskJob.class).withIdentity("Job1","group1").build();
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(cronScheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }
}
