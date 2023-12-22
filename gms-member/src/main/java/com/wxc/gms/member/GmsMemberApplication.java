package com.wxc.gms.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wxc.gms.member.feign")
public class GmsMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsMemberApplication.class, args);
    }

}
