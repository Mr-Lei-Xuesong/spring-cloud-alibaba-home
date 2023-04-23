package com.demo.domain;

import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2023/4/23 14:49
 * @Description: 用户实体类
 */
@Data
public class User {

    private String username;

    private String applicationName;

    private String serverPort;
}
