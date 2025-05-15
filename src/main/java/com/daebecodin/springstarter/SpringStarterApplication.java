package com.daebecodin.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStarterApplication.class, args);

        HelloWorldMessage hwm = new HelloWorldMessage();
        System.out.println(hwm.getMessage());
    }

}
