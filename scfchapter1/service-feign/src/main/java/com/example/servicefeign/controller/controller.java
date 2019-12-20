package com.example.servicefeign.controller;

import com.example.servicefeign.clients.ServiceHiClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 白雄雄
 * @Date: 2019/11/19 15:34
 */
@RestController
public class controller {

    @Autowired
    ServiceHiClients serviceHiClients;

    @RequestMapping("/hi")
    public String hello(@RequestParam(name = "name") String name) {
        String s = serviceHiClients.helloHi(name);
        return s;
    }
}
