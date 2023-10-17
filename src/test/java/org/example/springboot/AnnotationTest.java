package org.example.springboot;

import org.example.springboot.annotation.Child;
import org.example.springboot.annotation.Parent;

/**
 * {@code AnnotationTest}
 *
 * @author jianghong
 * @date 2023/09/20
 * @since 1.1.0
 */
public class AnnotationTest {

    public static void main(String[] args) {
//        Child child = Child.builder()
//                .name("jh")
//                .age(27)
//                .build();
//
//        System.out.println(child.getName());
//        System.out.println(child);

        Child child1 = new Child();
        child1.setName("wangqin");
        child1.setAge(25);

        System.out.println(child1.getName());
        System.out.println(child1);

        Parent parent = new Parent();
//        parent.test();
    }
}