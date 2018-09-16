package com.qbk.service;


import com.alibaba.dubbo.config.annotation.Service;


@Service(version = "${demo.service.version}")
public class DefaultHelloService2 implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("222222222222222222222");
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye "+name+" !";
    }
}
