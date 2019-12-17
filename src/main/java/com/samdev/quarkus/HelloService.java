package com.samdev.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {


    public String sayHello() {
        return "hello";
    }

}
