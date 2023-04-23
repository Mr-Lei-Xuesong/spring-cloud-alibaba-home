package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/13 11:39
 * @Description: 首页
 */
@RestController
@RequestMapping("/provider")
public class ProviderController implements UserService {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        user.setApplicationName(applicationName);
        user.setServerPort(serverPort);
        return user;
    }
}
