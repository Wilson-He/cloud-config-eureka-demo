package io.github.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 *
 * @author Wilson
 * @date 2019/4/11
 */
@RestController
@RequestMapping("/")
public class ProductController {
    @Value("${spring.profiles}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return "hello," + profile;
    }

    @GetMapping("/name")
    public String name(String name) {
        return "hello," + name;
    }
}
