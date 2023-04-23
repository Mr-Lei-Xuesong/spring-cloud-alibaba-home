package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/23 15:09
 * @Description: 用户业务层消费端
 */
@FeignClient(name = "nacos-provider", path = "/provider")
public interface UserServiceClient extends UserService {
}
