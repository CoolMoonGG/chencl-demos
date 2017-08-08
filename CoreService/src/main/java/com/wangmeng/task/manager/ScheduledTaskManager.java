package com.wangmeng.task.manager;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @CreatedBy : ChenChunlei .
 * @CreatedOn : 2017/6/29 0029 上午 11:40 .
 * @Description:   ScheduledExecutorService 实现定时任务
 */
public class ScheduledTaskManager {

    /**
     * ScheduledExecutorService是从Java SE5的java.util.concurrent里，做为并发工具类被引进的，这是最理想的定时任务实现方式。
     * 它有以下好处：
     * 1>相比于Timer的单线程，它是通过线程池的方式来执行任务的
     * 2>可以很灵活的去设定第一次执行任务delay时间
     * 3>提供了良好的约定，以便设定执行的时间间隔
     *
     * 下面是实现代码，我们通过ScheduledExecutorService#scheduleAtFixedRate展示这个例子，通过代码里参数的控制，首次执行加了delay时间。
     * @author ChenCl
     */
    public static void addTask(){
        Runnable runnable = new Runnable() {
            int i=1;
            String nowtime="";
            public void run() {
                // task to run goes here
                nowtime= DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
                System.out.println("Hello !!"+nowtime);
            }
        };
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间

        service.scheduleAtFixedRate(runnable, 5, 2, TimeUnit.SECONDS);
    }

}
