package com.vastika.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements MessageService {

    @Value("${user.email}")
        private String email;

    @Override
    public void sendMessage(String msg) {
        System.out.println(msg+" is send to" + email);
    }
}
