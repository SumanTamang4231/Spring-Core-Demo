package com.vastika;

import com.vastika.configuration.MessageConfiguration;
import com.vastika.controller.HelloController;
import com.vastika.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);
        MessageController messageController = context.getBean(MessageController.class);
        messageController.send();


        System.out.println("=======================");
        HelloController HelloController = context.getBean(HelloController.class);
        HelloController.sayHello();
    }
}
