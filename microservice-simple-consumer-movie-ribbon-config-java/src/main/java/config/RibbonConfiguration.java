package config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * 该类为Ribbon的配置类
 * 注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享，即变为全局配置。
 * @author caojx
 * @version $Id: RibbonConfiguration.java,v 1.0 2019-03-26 13:25 caojx
 * @date 2019-03-26 13:25
 */
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}