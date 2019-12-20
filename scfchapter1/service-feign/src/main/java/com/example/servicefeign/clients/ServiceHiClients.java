package com.example.servicefeign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 白雄雄
 * @Date: 2019/11/19 15:31
 */

@FeignClient(name = "service-hi",fallback = Fallback.class)
public interface ServiceHiClients {

    @GetMapping("/hi")
    public String helloHi(@RequestParam(name = "name") String name);
}
