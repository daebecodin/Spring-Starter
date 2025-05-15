package com.daebecodin.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this annotation is required to make this class a configuration bean
@ComponentScan("com.daebecodin.springstarter")  // this annotation helps spring scan all beas in the package required,
                                                // searches for beans, creates singleton instances of them, and adds them to the bean registry
public class SpringStarterApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringStarterApplication.class);
        System.out.println("got the context");
        Greeter greeter = ctx.getBean(Greeter.class); // gets bean from the bean registry
        greeter.greet(); // takes the created bean --> sees that it requires a HelloWorldMessage bean, injects it, and calls the greet methods
    }
    @Bean  // another way to instantiate a bean and pull it from the bean registry
    public HelloWorldMessage getHelloWorldMessage(String randomMessage) {
        return new HelloWorldMessage(randomMessage);
        // I removed the @component annotation from the HelloWorldMessage class,
        // so this method is required to make the HelloWorldMessage a bean
        // and ready for Java config
    }

    @Bean
    public Greeter getGreeter(HelloWorldMessage message) {
        return new Greeter(message);
        // since we want this bean to print the HelloWorldMessage,
        // we need to pass the HelloWorldBean to the method.
        // Spring likely already has the hwm bean ready for injection, so we dont
        // need to create a new one.
    }

    @Bean
    public String randomMessage() {
        return "Yo";
    }

}
