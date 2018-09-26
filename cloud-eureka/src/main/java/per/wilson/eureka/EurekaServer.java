package per.wilson.eureka;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hewx
 * @date: 2018/9/18
 * @since:
 */
@EnableEurekaServer
@SpringBootApplication
@Api
@RestController
@RequestMapping("/")
public class EurekaServer extends SpringBootServletInitializer {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(SpringApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class);
    }
}
