package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        // JDBC driver name and database URL
        String JDBC_DRIVER ;
        String DB_URL;

        //  Database credentials
        String USER;
        String PASS;

        Connection conn = null;

        try (InputStream input = new FileInputStream("C:\\Users\\37128\\IdeaProjects\\stage2-module4-task1\\task3-factory-pattern\\src\\main\\resources\\h2database.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value
            JDBC_DRIVER = prop.getProperty("jdbc_driver");
            DB_URL = prop.getProperty("db_url");
            USER = prop.getProperty("user");
            PASS = prop.getProperty("password");

            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);
            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return conn;
    }
}

