package per.wilson.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author: hewx
 * @date: 2018/9/18
 * @since:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/")
public class ClientApplication {

  private String username;

  private String age;

  @PostConstruct
  public void init(){
    System.err.println("username:" + username);
  }

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
