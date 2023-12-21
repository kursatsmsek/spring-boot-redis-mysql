package com.kursatdev.springbootredismysql.controller;

import com.kursatdev.springbootredismysql.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DummyController {

    private final CacheService cacheService;

    public DummyController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return cacheService.sayHelloService();
    }
}
