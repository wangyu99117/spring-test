package com.wangyu.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * Created by wangyu21 on 2018/4/2.
 */
@Service
public class SpringInterfaceTest implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Iterator<String> clazzNameIterator = configurableListableBeanFactory .getBeanNamesIterator();
        while (clazzNameIterator.hasNext()){
            System.out.println(clazzNameIterator.next());

        }
    }
}
