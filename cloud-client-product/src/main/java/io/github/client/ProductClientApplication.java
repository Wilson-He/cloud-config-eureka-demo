package io.github.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProductClientApplication
 *
 * @author Wilson
 * @date 2019/4/10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductClientApplication.class);
    }
}
