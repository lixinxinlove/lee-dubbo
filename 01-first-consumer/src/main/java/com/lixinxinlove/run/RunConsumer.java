package com.lixinxinlove.run;

import com.lixinxinlove.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunConsumer {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        SomeService service = (SomeService) ac.getBean("someService");
        String h = service.hello("Tom");
        System.out.println(h);
    }
}
