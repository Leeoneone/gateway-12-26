package com.yuan.configbusclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.yuan")
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigBusClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBusClientApplication.class, args);
    }

}
