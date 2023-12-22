package com.kursatdev.springbootredismysql.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    @Cacheable(cacheNames = "exampleCaches")
    public String sayHelloService() {
        return "Hello World !";
    }

    @CacheEvict(value = "movies", allEntries = true)
    public void clearCache() {
        System.out.println("Cleared Cache.");
    }
}
