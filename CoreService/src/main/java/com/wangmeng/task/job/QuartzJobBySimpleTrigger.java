package com.wangmeng.task.job;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * @CreatedBy  : ChenChunlei .
 * @CreatedOn  : 2017/6/29 0029 下午 1:49 .
 * @Description: Quartz 任务调度框架之： 频次任务(间隔一个时间段timeInternal 执行一次的任务)，继承QuartzJobBean的任务类
 */
public class QuartzJobBySimpleTrigger {

    private int timeout=1000;
    String nowtime="";
    //调度工厂实例化后，经过timeout时间开始执行调度
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * 要调度的具体任务
     */
    //--第一个调度任务
    public void doJob(){

        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("SimpleTriggerJob.doJob1 on:"+nowtime);

    }
    //--第二个调度任务
    public void doJob2(){

        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("SimpleTriggerJob.doJob2 on:"+nowtime);

    }


}