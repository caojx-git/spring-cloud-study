package caojx.learn.microservicesimplediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类注释，描述
 *
 * @author caojx
 * @version $Id: MicroserviceSimpleDiscroveryEurekaApplication.java,v 1.0 2019-03-20 23:45 caojx
 * @date 2019-03-20 23:45
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceSimpleDiscroveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleDiscroveryEurekaApplication.class, args);
    }

}