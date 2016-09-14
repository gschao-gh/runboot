package com.el.quartz.taskjob;

import com.el.common.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2016/9/14.
 */

public class MyTaskJob {

    private static Logger LOGGER = LogManager.getLogger(MyTaskJob.class);


    public void run(){
        LOGGER.info("定时任务---start:"+ DateUtils.getSystime());
        System.out.println("定时任务---start:"+ DateUtils.getSystime());
    }
}
