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
package org.example.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.example.springboot.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * {@code CustomEventListener}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 1.0.0
 */
@Slf4j
@Component
public class CustomEventListener /**implements ApplicationListener<CustomEvent>**/
{

//    @Override
//    public void onApplicationEvent(CustomEvent event) {
//        log.info(Thread.currentThread() + "监听到自定义事件...");
//    }

    // @EventListener 这种方式，所有单例bean初始化完成后发布事件，监听才能生效。
    // implements ApplicationListener 这种方式，则不需要担心发布事件的时机。
    @EventListener
    public void onApplicationEvent(CustomEvent event) {
        log.info("CustomEventListener->CustomEvent");
    }
}