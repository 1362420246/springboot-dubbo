package com.qbk.service;


import com.alibaba.dubbo.config.annotation.Service;




@Service(version = "${demo.service.version}")
public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("111111111111111");
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye "+name+" !";
    }
}
