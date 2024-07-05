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
package org.example.springboot.config;

import org.example.springboot.serializer.LocalDateTimeTimestampDeserializer;
import org.example.springboot.serializer.LocalDateTimeTimestampSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * {@code LocalDateTimeFormatterConfigure}
 *
 * @author jianghong
 * @date 2023/09/14
 * @since 1.0.0
 */
@Configuration
public class LocalDateTimeFormatterConfigure {

//    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return builder -> {
//            builder.serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(FORMATTER));
//            builder.deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer(FORMATTER));

            builder.serializerByType(LocalDateTime.class, new LocalDateTimeTimestampSerializer());
            builder.deserializerByType(LocalDateTime.class, new LocalDateTimeTimestampDeserializer());
        };
    }
}