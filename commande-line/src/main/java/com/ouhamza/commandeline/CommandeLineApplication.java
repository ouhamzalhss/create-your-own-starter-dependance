package com.ouhamza.commandeline;

import com.ouhamza.HelloService;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandeLineApplication {

    // our costume config, cancel AutoConfig
    /*@Bean
    public HelloService myhelloService(){
       return () -> LoggerFactory.getLogger(CommandLineRunner.class).info("Hello from My app");
    }*/

    public static void main(String[] args) {
        SpringApplication.run(CommandeLineApplication.class, args);
    }

}
