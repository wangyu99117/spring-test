package com.wangyu.spring.test;

import com.wangyu.spring.context.service.HelloTest;
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
    }
}
