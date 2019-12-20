package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 白雄雄
 * @Date: 2019/11/18 19:02
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String helloService(String name) {
        String hello = restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
        return hello;
    }

    public String hiError(String name) {
        return "hi"+name+"error";
    }
}
