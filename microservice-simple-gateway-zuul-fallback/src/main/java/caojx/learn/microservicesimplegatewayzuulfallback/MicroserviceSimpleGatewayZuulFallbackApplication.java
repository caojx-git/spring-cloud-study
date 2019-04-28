package caojx.learn.microservicesimplegatewayzuulfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 为Zuul提供回退
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceSimpleGatewayZuulFallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleGatewayZuulFallbackApplication.class, args);
    }

}
