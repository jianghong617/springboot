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
package org.example.springboot.es.repository;

import org.example.springboot.es.entity.Content;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * {@code ContentRepository}
 *
 * @author jianghong
 * @date 2024/04/07
 * @since 1.0.0
 */
@Repository
public interface ContentRepository extends ElasticsearchRepository<Content, String> {

    List<Content> findByTitleOrContent(String title, String content);
}