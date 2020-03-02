package com.sample.ssm.mapper;

import java.lang.reflect.Method;

public class MyLoggerImpl implements MyLogger {
    @Override
    public void saveIntoMethodTime(Method method) {
        System.out.println("进入"+method.getName()+"方法时间为："+System.currentTimeMillis());
    }

    @Override
    public void saveOutMethodTime(Method method) {
        System.out.println("退出"+method.getName()+"方法时间为："+System.currentTimeMillis());
    }
}
