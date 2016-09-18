package com.el.quartz;

import org.quartz.Scheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/18.
 */
@Service
public class ScheduleFactory {
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){

        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        return schedulerFactoryBean;
    }
}
