package caojx.learn.microservicehystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * Turbine是一个聚合Hystrix监控数据的工具，它可将所有相关/hystrix.stream端点的数据聚合到一个组合的/turbine.stream中，
 * 从而让集群的监控更加方便。
 */
@EnableTurbine
@SpringBootApplication
public class MicroserviceHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixTurbineApplication.class, args);
	}

}
