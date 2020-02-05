package com.ouhamza.commandeline;

import com.ouhamza.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * @author Lhouceine OUHAMZA
 */
@Service
public class StartUp implements CommandLineRunner {

    @Value("${conference.name:Maroc}")
    private String confernce;

    private final HelloService helloService;

    @Autowired
    public StartUp(HelloService helloService){
        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.sayHello();
        System.out.println("et Aussi "+ confernce);
    }
}
