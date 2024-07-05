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
package org.example.springboot.es.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * {@code Content}
 *
 * @author jianghong
 * @date 2024/04/07
 * @since 1.0.0
 */
@Data
@Document(indexName = "content")
public class Content implements Serializable {

    private static final long serialVersionUID = 3756941399734664203L;

    @Id
    private String id;

    private String title;

    private String content;
}