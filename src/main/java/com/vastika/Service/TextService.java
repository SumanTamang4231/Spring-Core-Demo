package com.vastika.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("textService")
public class TextService implements MessageService{

    @Value("${user.mobile_no}")
    private String mobileNo;

    public void sendMessage(String msg) {
        System.out.println(msg + " is sent to " + mobileNo );
    }
}
