package com.demo.service;

import com.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/23 14:49
 * @Description: 用户业务层
 */
public interface UserService {

    /**
     * 根据用户名
     *
     * @param username 用户名
     * @return 用户信息
     */
    @GetMapping("/getUser")
    User getUser(@RequestParam("username") String username);
}
