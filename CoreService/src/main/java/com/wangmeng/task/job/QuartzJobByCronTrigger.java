package com.wangmeng.task.job;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * @CreatedBy : ChenChunlei .
 * @CreatedOn : 2017/6/29 0029 下午 1:49 .
 * @Description:  Quartz 任务调度框架之：定时任务(在某一个时刻触发的任务)， 普通的任务类
 */
public class QuartzJobByCronTrigger {
    int i=1;
    String nowtime="";

    public QuartzJobByCronTrigger(){
        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("QuartzJobByCronTrigger has Started."+nowtime);

    }



    //--第一个调度任务
     public void doJob(){

         nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
         System.out.println("QuartzJobByCronTrigger.doJob1 on:"+nowtime);

     }
    //--第二个调度任务
    public void doJob2(){

        nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println("QuartzJobByCronTrigger.doJob2 on:"+nowtime);

    }


}
