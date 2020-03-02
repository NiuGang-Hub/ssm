package com.sample.ssm.mapper;

import java.lang.reflect.Proxy;

public class MyLoggerTest {
    public static void main(String[] args) {
        BusinessClassService businessClassService = new BusinessClassServiceImpl();
        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);
        BusinessClassService businessClass = (BusinessClassService) Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(),businessClassService.getClass().getInterfaces(),myLoggerHandler);
        businessClass.doSomeThing();
    }
}
