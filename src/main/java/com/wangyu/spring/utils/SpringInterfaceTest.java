package com.wangyu.spring.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/**
 * Created by wangyu21 on 2018/4/2.
 * spring 容器加载完成后 立即执行
 */
//@Service
public class SpringInterfaceTest implements BeanFactoryPostProcessor {

    private static Logger log = LoggerFactory.getLogger(SpringInterfaceTest.class);
    
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        try{
            Iterator<String> clazzNameIterator = configurableListableBeanFactory .getBeanNamesIterator();
            while (clazzNameIterator.hasNext()){
                String clazzName = clazzNameIterator.next();
                System.out.println(clazzName);

                Class c = configurableListableBeanFactory.getBean(clazzName).getClass();
                Annotation[] annotations = c.getAnnotations();
                for(Annotation annotation : annotations){
                    System.out.println(annotation + "----");
                }
            }
        }catch (Exception e){
            log.error("--", e);
        }

    }
}
