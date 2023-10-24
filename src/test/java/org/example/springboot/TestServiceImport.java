package org.example.springboot;

import com.zero.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code TestServiceTest}
 *
 * @author jianghong
 * @date 2023/09/21
 * @since 1.1.0
 */
@SpringBootTest
public class TestServiceImport {

    @Autowired
    private TestService testService;

    @Test
    void test() {
        System.out.println(testService.test("wangqin"));
    }

    @Test
    void testContextStartedEvent() {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
//
//        applicationContext.start();
    }
}