package com.lixinxinlove.service;


public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("Dubbo World Welcome You，" + name);
        return "lee";
    }
}
