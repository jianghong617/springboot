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
package org.example.springboot.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * {@code ListLongJsonSerializer}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
public class ListLongJsonSerializer extends JsonSerializer<List<Long>> {

    @Override
    public void serialize(List<Long> value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<String> targets = Optional.ofNullable(value).orElse(Collections.emptyList())
                .stream().map(String::valueOf).collect(Collectors.toList());

        jsonGenerator.writeStartArray();
        this.writeContents(targets, jsonGenerator);
        jsonGenerator.writeEndArray();
    }

    private void writeContents(List<String> targets, JsonGenerator jsonGenerator) throws IOException {
        for (String target : targets) {
            jsonGenerator.writeString(target);
        }
    }
}