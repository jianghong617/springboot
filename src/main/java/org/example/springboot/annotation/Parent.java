package org.example.springboot.annotation;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * {@code Parent}
 *
 * @author jianghong
 * @date 2023/09/20
 * @since 1.1.0
 */
@Data
//@SuperBuilder
public class Parent {

    private String name;

    public Parent() {

    }

    private void test() {
        String name = this.name;

        System.out.println("测试子类访问私有方法！");
    }
}