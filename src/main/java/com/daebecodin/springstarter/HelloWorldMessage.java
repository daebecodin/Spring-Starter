package com.daebecodin.springstarter;

import org.springframework.stereotype.Component;

// @Component // this annotation is required to make this class a string bean
public class HelloWorldMessage {

    public String getMessage() {
        return "Hello World!";
    }

}
