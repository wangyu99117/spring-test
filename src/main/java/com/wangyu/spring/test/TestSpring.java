package com.wangyu.spring.test;

import com.wangyu.spring.context.service.HelloTest;
import com.wangyu.spring.context.service.TodayService;
import com.wangyu.spring.utils.SpringContextUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangyu21 on 2018/4/2.
 */
public class TestSpring {

    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloTest word = (HelloTest) applicationContext.getBean("helloTest");
        Integer res = word.testPublish();
        System.out.println(res + "---------");


        SpringContextUtils utils = (SpringContextUtils) applicationContext.getBean("springContextUtils");
        TodayService todayService = utils.getBean("todayService");
        Integer today = todayService.testToday();
        System.out.println(today + "---------");
    }
}
