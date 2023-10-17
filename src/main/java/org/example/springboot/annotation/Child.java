package org.example.springboot.annotation;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * {@code Child}
 *
 * @author jianghong
 * @date 2023/09/20
 * @since 1.1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
//@SuperBuilder
public class Child extends Parent {

    private Integer age;

    public Child() {
        super();
    }
}