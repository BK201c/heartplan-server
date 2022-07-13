package com.uuget.heartplanServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.uuget.heartplanServer.model.dao")
public class HeartplanServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeartplanServerApplication.class, args);
    }

}
