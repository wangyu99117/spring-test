package com.wangyu.spring.context.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangyu21 on 2018/4/2.
 */
@Service
public class TodayService {

    @Resource
    private HelloTest helloTest;



    public Integer testToday(){
        return 300;
    }
}
