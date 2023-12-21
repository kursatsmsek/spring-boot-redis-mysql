package com.kursatdev.springbootredismysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisMysqlApplication.class, args);
    }

}
