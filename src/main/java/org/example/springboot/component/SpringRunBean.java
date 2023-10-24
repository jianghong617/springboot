package org.example.springboot.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * {@code SpringRunBean}
 *
 * @author jianghong
 * @date 2023/10/23
 * @since 2.3.0
 */
@Component
public class SpringRunBean implements CommandLineRunner, ApplicationRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringRunBean->CommonLineRun");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("SpringRunBean->ApplicationRun");
    }
}