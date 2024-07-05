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
package org.example.springboot;

import cn.hutool.core.io.IoUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * {@code JavaResourceDemo}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 1.0.0
 */
@Slf4j
@SpringBootTest
class JavaResourceTest {

    @Test
    void test() throws IOException {
//        URL url = new URL("http://www.baidu.com");
        URL url = new URL("file:///C:/Users/Admin/Desktop/杂七杂八/账号相关.txt");
        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();
        String content = IoUtil.read(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        log.info(content);
    }
}
