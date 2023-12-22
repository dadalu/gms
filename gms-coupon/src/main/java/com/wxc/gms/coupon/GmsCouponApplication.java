package com.wxc.gms.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wxc.gms.coupon.feign")
public class GmsCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsCouponApplication.class, args);
    }

}
