package com.bjpowernode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class CloudProviderPayment800101Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment800101Application.class, args);
    }

}
