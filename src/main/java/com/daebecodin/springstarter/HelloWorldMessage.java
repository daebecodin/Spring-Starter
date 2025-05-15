package com.daebecodin.springstarter;

import org.springframework.stereotype.Component;

// @Component // this annotation is required to make this class a string bean
public class HelloWorldMessage {

    String randomMessage;
    public HelloWorldMessage(String randomMessage) {
        this.randomMessage = randomMessage;
    }

    public String getMessage() {
        return this.randomMessage + ", World";
    }

}
