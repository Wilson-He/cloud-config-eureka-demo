package per.wilson.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: hewx
 * @date: 2018/9/18
 * @since:
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ServerApp {

  public static void main(String[] args) {
    SpringApplication.run(ServerApp.class);
  }
}
