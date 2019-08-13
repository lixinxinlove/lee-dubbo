package com.lixinxinlove.run;


import com.lixinxinlove.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * company: www.kaikeba.com
 * Author: Rey
 */
public class RunConsumer {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        SomeService service = (SomeService) ac.getBean("someService");
        //
        // System.out.println(service.hello("Tom"));
        // System.out.println(service.hello("Jerry"));
        // System.out.println(service.hello("Tom"));
        // System.out.println(service.hello("Jerry"));
        //
        for(int i=1; i<=1000; i++) {
            service.hello("i==" + i);
        }
        // 将第1个缓存内容挤出去
        System.out.println(service.hello("Tom"));
        // 会从提供者处获取 -- 提供者方会有输出
        System.out.println(service.hello("i==1"));
        // 会从结果缓存中获取 -- 提供者方不会有输出
        System.out.println(service.hello("i==600"));
    }
}
