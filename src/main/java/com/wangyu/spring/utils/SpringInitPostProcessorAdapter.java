package com.wangyu.spring.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * Created by wangyu21 on 2018/4/4.
 * InstantiationAwareBeanPostProcessor 是 BeanFactoryPostProcessor 的子接口，两个不能同时启用
 * 参考 ：https://www.cnblogs.com/zrtqsk/p/3735273.html
 * http://www.blogjava.net/max/archive/2009/11/20/303112.html
 * ceshiss
 */
@Component
public class SpringInitPostProcessorAdapter implements InstantiationAwareBeanPostProcessor {

    private static Logger log = LoggerFactory.getLogger(SpringInitPostProcessorAdapter.class);

    public Object postProcessBeforeInstantiation(Class<?> aClass, String s) throws BeansException {
        log.error(aClass.getName() + "-----" + s + "=====================");
        return null;
    }

    public boolean postProcessAfterInstantiation(Object o, String s) throws BeansException {
        log.error(o.getClass().getName() + "---@@@@--" + s + "=====================");
        return false;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s) throws BeansException {
        log.error(o.getClass().getName() + "---@@@@--" + s + "=====================!!!!!!!!" + propertyValues.toString() + "-----" + propertyDescriptors.toString());
        return null;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        log.error(o.getClass().getName() + "---@@@@%%%%%%%%%%%%%%%%%--" + s + "=====================");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        log.error(o.getClass().getName() + "---@@@@******************--" + s + "=====================");
        return null;
    }
}
