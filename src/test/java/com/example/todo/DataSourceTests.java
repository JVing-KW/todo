package com.example.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class DataSourceTests {
    @Autowired
    private DataSource dataSource;

    @Test
    public void connetTest() throws SQLException {
    Connection con = dataSource.getConnection();
        Assertions.assertNotNull(con);

    }
    
    
}
