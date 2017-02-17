package com.sinon.controller.timer;

import com.sinon.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by
 * autor: ghh on
 * Date: 2017/2/16.
 * Time: 15:37
 */
@Component
public class ScheduledTest {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTest.class);
    @Autowired
    private UserService userService;

    @Scheduled(cron = "0/2 * * * * ?")
    public void executeFileDownLoadTask() {
        // 间隔2分钟,执行任务
//        Thread current = Thread.currentThread();
//        logger.info("ScheduledTest.executeFileDownLoadTask 定时任务1:" + current.getId() + ",name:" + current.getName());
//        User userInfo = userService.getUserInfo();
//        logger.info("姓名：" + userInfo.getName());
//        logger.info("年龄：" + userInfo.getAge());
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void executeTask() {
        // 间隔2分钟,执行任务
//        logger.info("第二个任务 ");
    }

}
