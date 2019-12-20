package com.example.servicefeign.clients;

import org.springframework.stereotype.Component;

/**
 * @Author: 白雄雄
 * @Date: 2019/11/19 16:08
 */
@Component
public class Fallback implements ServiceHiClients {
    @Override
    public String helloHi(String name) {
        return "biggg";
    }
}
