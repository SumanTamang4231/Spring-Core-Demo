package com.vastika;

import com.vastika.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext  context= new AnnotationConfigApplicationContext(MessageController.class);
        MessageController messageController = context.getBean(MessageController.class);
        messageController.send();
    }
}
