package com.daebecodin.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component // declaring this class a bean
public class Greeter {
    HelloWorldMessage hwm;

    //
    public Greeter() {

    }

    /*  since we want this object to be instantiated by spring, we need a default constructor
        in the constructor we want to inject the HelloWorldMessage bean as a dependency,
        so every time we want to create a Greeter object, we need a valid HelloWorldMessage bean
        ready for injection
     */
    @Autowired  // we add this annotation to automatically instantiate this constructor
                // since there are two constructors, we need to specify which one to use on startup
    public Greeter(HelloWorldMessage hwm) {
        this.hwm = hwm;
    }

    public void greet() {
        System.out.println(this.hwm.getMessage());
    }
}
