package io.westerngun.udemyspringmasterclass.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiringExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutowiringExample.class, args);

    }
}
