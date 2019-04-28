package caojx.learn.microservicesimpleconsumermovieribbonconfigjava.config;

import config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定的目标服务自定义配置。使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 * 可参考的示例：
 * http://spring.io/guides/gs/client-side-load-balancing/
 *
 * @author caojx
 * @version $Id: TestConfiguration.java,v 1.0 2019-03-26 13:17 caojx
 * @date 2019-03-26 13:17
 */
@Configuration
@RibbonClient(name = "microservice-simple-provider-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}