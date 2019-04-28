package caojx.learn.microservicesimplegatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 加注解：@EnableZuulProxy
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceSimpleGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleGatewayZuulApplication.class, args);
    }

}
