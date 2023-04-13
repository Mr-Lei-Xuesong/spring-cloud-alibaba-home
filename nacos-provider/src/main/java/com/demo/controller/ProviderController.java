package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/13 11:39
 * @Description: 首页
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping(value = "/provider/{id}")
    public String getInfo(@PathVariable("id") Integer id) {
        return "服务名：" + applicationName + "==>端口号： " + serverPort + "==>传入的参数：" + id;
    }
}
