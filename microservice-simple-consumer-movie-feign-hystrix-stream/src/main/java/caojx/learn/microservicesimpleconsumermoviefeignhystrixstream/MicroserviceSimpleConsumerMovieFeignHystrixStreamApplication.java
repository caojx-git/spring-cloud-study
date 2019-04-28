package caojx.learn.microservicesimpleconsumermoviefeignhystrixstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceSimpleConsumerMovieFeignHystrixStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerMovieFeignHystrixStreamApplication.class, args);
    }

}
