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
package org.example.springboot.es.service.impl;

import org.example.springboot.es.entity.Content;
import org.example.springboot.es.repository.ContentRepository;
import org.example.springboot.es.service.ContentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@code ContentServiceImpl}
 *
 * @author jianghong
 * @date 2024/04/07
 * @since 1.0.0
 */
@Service
public class ContentServiceImpl implements ContentService {

    private final ContentRepository contentRepository;

    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public List<Content> searchDocuments(String keyword) {
        return this.contentRepository.findByTitleOrContent(keyword, keyword);
    }

    @Override
    public void saveDocument(Content content) {
        this.contentRepository.save(content);
    }
}