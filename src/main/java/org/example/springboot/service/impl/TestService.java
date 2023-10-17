package org.example.springboot.service.impl;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * {@code TestService}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
public class TestService implements /*ImportSelector*/ DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.example.springboot.service.impl.OtherServiceImpl"};
    }
}