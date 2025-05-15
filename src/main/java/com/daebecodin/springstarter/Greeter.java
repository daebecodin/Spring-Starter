package com.daebecodin.springstarter;

import org.springframework.stereotype.Component;

@Component // declaring this class a bean
public class Greeter {
    HelloWorldMessage hwm;

    /*  since we want this object to be instantiated by spring, we need a default constructor
     in the constructor we want to inject the HelloWorldMessage bean as a dependency,
      so every time we want to create a Greeter object, we need a valid HelloWorldMessage bean
      ready for injection
     */
    public Greeter(HelloWorldMessage hwm) {
        this.hwm = hwm;
    }

    public void greet() {
        System.out.println(this.hwm.getMessage());
    }
}
