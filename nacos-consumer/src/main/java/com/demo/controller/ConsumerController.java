package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserServiceConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/13 14:41
 * @Description: 消费者接口
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/consumer")
public class ConsumerController {

    private final UserServiceConsumer userServiceConsumer;

    @GetMapping("/test")
    public User getUser(String username) {
        return userServiceConsumer.getUser(username);
    }
}
