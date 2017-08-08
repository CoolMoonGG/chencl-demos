package com.wangmeng.task.job;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @CreatedBy : ChenChunlei .
 * @CreatedOn : 2017/7/7 0007 下午 5:36 .
 * @Description:
 */
@Component("ScheduledJob")
public class ScheduledJob {
    String nowtime="";

    /**
     * 要调度的具体任务
     /**
     * cron表达式：* * * * * *（共6位或7位，使用空格隔开，具体如下）
     * cron表达式：*(秒0-59) *(分钟0-59) *(小时0-23) *(日期1-31) *(月份1-12或是JAN-DEC) *(星期1-7或是SUN-SAT)
     * 定时卡点计算。每天凌晨 02:00 执行一次
     */
//    @Scheduled(cron = "0 0 2 * * *") //在配置文件中配置更好
    //--第一个调度任务
    public void doJob1(){

        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("ScheduledJob.doJob1 on:"+nowtime);

    }
    //--第二个调度任务
    public void doJob2(){

        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("ScheduledJob.doJob2 on:"+nowtime);

    }


}
