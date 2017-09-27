package com.example.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ExampleTimer {

    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /*每100秒执行一次*/
    @Scheduled(fixedRate = 100000)
    public void timerRate() {
        System.out.println("我");
    }


    /*每天12:00:00时执行*/
    @Scheduled(cron = "0 00 12 * * ? ")
    public void timerCron() {
        System.out.println("current time : "+ dateFormat.format(new Date()));
    }
}
