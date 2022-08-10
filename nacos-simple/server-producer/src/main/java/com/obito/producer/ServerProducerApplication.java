package com.obito.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProducerApplication.class, args);
    }

}
