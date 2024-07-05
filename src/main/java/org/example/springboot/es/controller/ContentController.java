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
package org.example.springboot.es.controller;

import org.example.springboot.es.entity.Content;
import org.example.springboot.es.service.ContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * {@code ContentController}
 *
 * @author jianghong
 * @date 2024/04/07
 * @since 1.0.0
 */
@RestController
@RequestMapping("/documents")
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/search")
    public List<Content> searchDocuments(@RequestParam String keyword) {
        return this.contentService.searchDocuments(keyword);
    }

    @PostMapping("/add")
    public void addDocument(@RequestBody Content content) {
        this.contentService.saveDocument(content);
    }
}