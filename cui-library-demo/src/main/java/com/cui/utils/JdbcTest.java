package com.cui.utils;


import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcTest {

    @Test
    public void test() {
        try {
            Connection connection = JdbcUtils.getconn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
