package com.wangmeng.task.job;

import com.wangmeng.beans.SmsInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @CreatedBy  : ChenChunlei .
 * @CreatedOn  : 2017/9/21 0021 下午 3:06 .
 * @Description: 利用多线程和队列管理待发送的短信息
 */
public class SmsThreadJob {
    private static Logger logger = Logger.getLogger(SmsThreadJob.class);
    private static Queue<SmsInfo> smsList = new LinkedList<>();
    private static SmsThreadJob smsTaskInstance;
    private RunningTread runTread;
    private Thread tread;
    private boolean run = false;

    private SmsThreadJob(){
        run = true;
        runTread = new RunningTread();
        tread = new Thread(runTread);
        tread.setName("SmsThreadJob task thread");
        tread.start();

    }
    public static SmsThreadJob getInstance(){
        if(smsTaskInstance==null){
            smsTaskInstance=new SmsThreadJob();
        }
        return smsTaskInstance;
    }
    /** 将待发消息加入消息队列 **/
    public   void addSmsToQueue(SmsInfo sms){
        if(sms!=null){
            if(StringUtils.isNotEmpty(sms.getCellPhone())&& StringUtils.isNotEmpty(sms.getTempleteCode())){
                smsList.add(sms);
            }else{
                System.out.println("##SmsThreadJob.addSmsToQueue failed.Cellphone or TempleteCode is empty.");
            }
        }

    }


    private class RunningTread implements Runnable{
//        private  MessagesendService messagesendService=(MessagesendService) ApplicationContextHolderSingleton.getInstance().getBean("messagesendServiceImpl");

        @Override
        public void run() {
            try {
                run = true;
                SmsInfo model;
                while (run) {
                    if (smsList.size() > 0) {
                        /**sendmsg*/
                        System.out.println("-----SmsThreadJob.sendMsg------");
                        model = smsList.poll();
//                        messagesendService.Messagesend(model.getParmArr(), model.getCellPhone(), model.getTempleteCode(), 1, model.getCellPhone(), model.getBusinessType());
                    } else {
                        /** 如果队列中没有待发消息就休眠8S **/
                        Thread.sleep(8000);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                logger.warn(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                logger.warn(e.getMessage());
            }
        }
    }
}
