package caojx.learn.microservicesimpleconsumermoviefeignconfigproperties.feign;

import caojx.learn.microservicesimpleconsumermoviefeignconfigproperties.entity.User;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * 编写Feign Client
 *
 * 这样一个Feign Client就写完啦！其中，@FeignClient 注解中的microservice-provider-user是想要请求服务的名称，这是用来创建Ribbon Client的（Feign整合了Ribbon）。
 * 在本例中，由于使用了Eureka，所以Ribbon会把microservice-provider-user 解析成Eureka Server中的服务。
 *
 * 除此之外，还可使用url属性指定请求的URL（URL可以是完整的URL或主机名），例如@FeignClient(name = "abcde", url = "http://localhost:8000/") 。此时，name可以是任意值，但不可省略，否则应用将无法启动！
 *
 * @author caojx
 * @version $Id: UserFeignClient.java,v 1.0 2019-03-31 22:15 caojx
 * @date 2019-03-31 22:15
 */
@FeignClient(name = "microservice-simple-provider-user",configuration = UserFeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}

/**
 * 默认Feign是不打印任何日志的，下面我们来开启Feign的日志，Feign有四种日志级别：
 *
 * NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
 * BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及执行时间。
 * HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
 * FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body和元数据。
 *
 *
 * 该Feign Client的配置类，注意：
 * 1. 该类可以独立出去；
 * 2. 该类上也可添加@Configuration声明是一个配置类；
 * 配置类上也可添加@Configuration注解，声明这是一个配置类；
 * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
 * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
 * 个人建议：像我一样，不加@Configuration注解
 *
 *
 * 属性配置方式优先级高于代码配置方式
 *
 *
 * @author zhouli
 */

class UserFeignConfig{
    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}