package com.demo.service.impl;

import com.demo.domain.User;
import com.demo.service.UserServiceProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/23 17:09
 * @Description: 用户业务服务实现层
 */
@Service
@RequiredArgsConstructor
public class UserServiceProviderImpl implements UserServiceProvider {

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
