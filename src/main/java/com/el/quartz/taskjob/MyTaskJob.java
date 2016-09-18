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

public class MyTaskJob implements Job{

    private static Logger logger = LogManager.getLogger(MyTaskJob.class);


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.error("###error定时任务---start:"+ DateUtils.getSystime());
        logger.info("###info定时任务---start:"+ DateUtils.getSystime());
        logger.debug("###debug定时任务---start:"+ DateUtils.getSystime());
    }
}
