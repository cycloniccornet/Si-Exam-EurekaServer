package si.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiApplication.class, args);
    }

}
