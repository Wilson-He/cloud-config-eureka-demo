package per.wilson.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hewx
 * @date: 2018/9/18
 * @since:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientApplication {

  @Value("${test.username}")
  private String username;

  @Value("${age}")
  private String age;

  @GetMapping("/index")
  public String index() {
    return username;
  }

  @GetMapping("/age")
  public String age() {
    return age;
  }

  public static void main(String[] args) {
    SpringApplication.run(ClientApplication.class);
  }
}
