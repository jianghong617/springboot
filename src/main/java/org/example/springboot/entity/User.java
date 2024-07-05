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
package org.example.springboot.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.regex.Pattern;

/**
 * {@code User}
 *
 * @author jianghong
 * @date 2024/04/10
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class User {

    private Long id;

    private String username;

    public static void main(String[] args) {
        //.regex(Pattern.quote(v));

        String input = ".*?abc"; // 包含了正则表达式的特殊字符
        String escapedInput = Pattern.quote(input); // 对字符串进行转义

        System.out.println("Input: " + input);
        System.out.println("Escaped input: " + escapedInput);

        // 使用转义后的字符串创建正则表达式
        String regex = ".*?abc";
        boolean matches = "123abc".matches(regex);
        System.out.println(matches); // 输出 true

        // 直接使用原始字符串创建正则表达式，不会匹配
        String wrongRegex = ".*?abc";
        boolean wrongMatches = "123abc".matches(wrongRegex);
        System.out.println(wrongMatches); // 输出 false
    }
}