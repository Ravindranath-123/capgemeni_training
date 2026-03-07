package com.example.demo;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cloudStorage")
@Primary
class CloudStorageService implements StorageService {

    CloudStorageService() {
        System.out.println("CloudStorageService bean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("CloudStorageService bean initialized");
    }
    @Override
    public void storeFile(String fileName) {
        System.out.println("File stored in Cloud Storage: "+fileName);
    }
    @PreDestroy
    public void destroy() {
        System.out.println("CloudStorageService bean destroyed");
    }
}









