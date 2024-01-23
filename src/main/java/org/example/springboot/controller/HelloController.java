/*
 * Copyright (c) 2024 Zero Co., Ltd. All rights reserved.
 *
 * This software is owned by Zero Co., Ltd.
 * Without the official authorization of Zero Co., Ltd.,
 * no enterprise or individual can obtain, read, install,
 * or disseminate any content protected by intellectual
 * property rights involved in this software.
 *
 * The website of zero, please see <https://zero.com>
 */
package org.example.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.springboot.dto.UserDTO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * {@code HelloController}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@Slf4j
@RestController
public class HelloController implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", "jianghong");

        LocalDateTime expireTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(session.getMaxInactiveInterval()), ZoneId.systemDefault());
        log.info("session信息: sessionId:" + session.getId() + ", 过期时间:" + expireTime);
        return "Hello " + name;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getName() + ", 你的年龄是：" + userDTO.getAge();
    }

    @GetMapping("/test")
    public String test() {
        CustomController bean = this.beanFactory.getBean(CustomController.class);
        return "hello " + bean.getName();
    }
}