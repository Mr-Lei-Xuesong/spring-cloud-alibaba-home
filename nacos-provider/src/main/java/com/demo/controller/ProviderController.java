package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserServiceProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/13 11:39
 * @Description: 首页
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/provider")
public class ProviderController {

    private final UserServiceProvider userServiceProvider;

    @GetMapping("/getUser")
    public User getUser(String username) {
        return userServiceProvider.getUser(username);
    }
}
