package com.daebecodin.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    // setter injection
public class Speaker {
    HelloWorldMessage hwm;

    public Speaker(HelloWorldMessage hwm) {
        this.hwm = hwm;
    }
    public HelloWorldMessage getHwm() {
        return hwm;
    }
    public void speak() {
        System.out.println(this.hwm.getMessage());
    }

    // when this class is called, this is the default
    @Autowired
    public void setHwm(HelloWorldMessage hwm) {
        this.hwm = hwm;
    }
}
