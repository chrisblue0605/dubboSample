package com.testfan.auto.consumer;

import com.testfan.auto.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static String test(String inString){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        DemoService demoService= (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello(inString);
        return hello;
    }

    public static void main(String []args)
    {
        String outString = Consumer.test("Chris");
        System.out.println(outString);
    }
}
