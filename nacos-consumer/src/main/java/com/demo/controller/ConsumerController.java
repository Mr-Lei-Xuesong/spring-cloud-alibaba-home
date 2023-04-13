package com.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/13 14:41
 * @Description: 消费者接口
 */
@RestController
@RequiredArgsConstructor
public class ConsumerController {

    private final RestTemplate restTemplate;

    @Value("${service.provider.url}")
    private String provider;

    @GetMapping(value = "/consumer/{id}")
    public String getProviderInfo(@PathVariable("id") Integer id) {
        System.out.println("provider:" + provider);
        System.out.println("id:" + id);
        return restTemplate.getForObject(provider + "/provider/" + id, String.class);
    }
}
