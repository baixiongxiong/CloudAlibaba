package com.example.serviceribbon.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 白雄雄
 * @Date: 2019/11/19 14:28
 */
@Configuration
@RibbonClient(name = "service-hi",configuration = RibbonConfig.class)
public class TestRibbon {
}
