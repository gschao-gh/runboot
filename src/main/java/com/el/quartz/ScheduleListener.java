package com.el.quartz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/18.
 */
@Service
public class ScheduleListener implements ApplicationListener<ContextRefreshedEvent> {
    private static Logger logger = LogManager.getLogger(ScheduleListener.class);
    @Autowired
    private MyScheduler myScheduler;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        try {
            logger.info("定时任务监听器，开始定时任务调度");
            myScheduler.sheduleJob();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
