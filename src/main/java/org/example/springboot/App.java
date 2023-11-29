package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code App}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);

//        application.addInitializers(new CustomApplicationContextInitializer());
        application.run(args);
    }
}