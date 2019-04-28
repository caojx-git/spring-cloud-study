package caojx.learn.microservicesimplehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 前面，我们已可通过/actuator/hystrix.strem 端点观察Hystrix运行情况，但文字形式的监控数据很不直观。
 * 现实项目中一般都需要一个可视化的界面，这样才能迅速了解系统的运行情况。
 * Hystrix提供了一个轮子——Hystrix Dashboard，它的作用只有一个，那就是将文字形式的监控数据转换成图表展示。
 * http://localhost:8030/hystrix
 */
@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceSimpleHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleHystrixDashboardApplication.class, args);
    }

}
