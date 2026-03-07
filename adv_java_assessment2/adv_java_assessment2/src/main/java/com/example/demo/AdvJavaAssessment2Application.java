package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AdvJavaAssessment2Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext context=SpringApplication.run(AdvJavaAssessment2Application.class, args);

        System.out.println("Container Started");

        StorageService storage = context.getBean(StorageService.class);
        storage.storeFile("data.txt");
        
        System.out.println("Getting LocalStorage Twice");
        StorageService l1 = context.getBean("localStorage",StorageService.class);
        StorageService l2 = context.getBean("localStorage",StorageService.class);
        System.out.println("Are both local beans same : " + (l1==l2));
        context.close(); 
        System.out.println("Container closed");
    } 
}