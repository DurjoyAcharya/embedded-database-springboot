package com.example.embedded_database_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class EmbeddedDatabaseSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmbeddedDatabaseSpringBootApplication.class, args);
    }

}
