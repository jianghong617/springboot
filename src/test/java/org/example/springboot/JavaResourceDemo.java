package org.example.springboot;

import cn.hutool.core.io.IoUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * {@code JavaResourceDemo}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
@SpringBootTest
public class JavaResourceDemo {

    @Test
    void test() throws IOException {
//        URL url = new URL("http://www.baidu.com");
        URL url = new URL("file:///C:/Users/Admin/Desktop/杂七杂八/账号相关.txt");
        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();
        String content = IoUtil.read(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        System.out.println(content);
    }
}