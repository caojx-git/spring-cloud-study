package caojx.learn.microservicesimpleconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 编写Config Server
 */
@EnableConfigServer
@SpringBootApplication
public class MicroserviceSimpleConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConfigServerApplication.class, args);
    }

}
