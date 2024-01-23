package org.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * {@code DataSourceTest}
 *
 * @author jianghong
 * @date 2023/09/21
 * @since 1.1.0
 */
@SpringBootTest
public class DataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void test() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from sys_user");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            log.info(resultSet.getString("account"));
            log.info(resultSet.getString("name"));
            log.info("################################");
        }
    }
}