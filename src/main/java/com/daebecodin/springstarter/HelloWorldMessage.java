package com.daebecodin.springstarter;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// @Component // this annotation is required to make this class a string bean
public class HelloWorldMessage {

    String randomMessage;
    public HelloWorldMessage(String randomMessage) {
        System.out.println("HelloWorldMessage constructor called");
        this.randomMessage = randomMessage;
    }

    public String getMessage() {
        return this.randomMessage + ", World";
    }

}
