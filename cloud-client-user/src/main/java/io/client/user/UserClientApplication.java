package io.client.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * UserClientApplication
 *
 * @author Wilson
 * @date 2019/4/9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserClientApplication.class);
    }
}
