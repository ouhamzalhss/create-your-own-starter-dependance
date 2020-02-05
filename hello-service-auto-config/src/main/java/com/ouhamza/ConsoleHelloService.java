package com.ouhamza;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lhouceine OUHAMZA
 */

public class ConsoleHelloService implements HelloService {

    @Autowired
    private HelloProperties helloProperties;

    @Override
    public void sayHello(){
        System.out.println(this.helloProperties.getPrefix() + " "+ this.helloProperties.getSuffix());
    }
}
