package com.daebecodin.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this annotation is required to make this class a configuration bean
@ComponentScan("com.daebecodin.springstarter")  // this annotation helps spring scan all beas in the package required,
                                                // searches for beans, creates singleton instances of them, and adds them to the bean registry
public class SpringStarterApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringStarterApplication.class);
        Greeter greeter = ctx.getBean(Greeter.class); // gets bean from the bean registry
        greeter.greet(); // takes the created bean --> sees that it requires a HelloWorldMessage bean, injects it, and calls the greet methods
    }

}
