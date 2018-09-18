package per.wilson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: hewx
 * @date: 2018/9/18
 * @since:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServer.class);
  }
}
