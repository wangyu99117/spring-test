package com.wangyu.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by wangyu21 on 2018/4/2.
 */
@Service
public class SpringContextUtils implements ApplicationContextAware{

    private ApplicationContext ctx = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public <T> T getBean(String name){
        return (T)ctx.getBean(name);
    }
}
