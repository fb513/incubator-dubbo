package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

}
