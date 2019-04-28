package caojx.learn.microservicesimpleconsumermoviehystrixcommand.controller;

import caojx.learn.microservicesimpleconsumermoviehystrixcommand.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * 电影控制器
 *
 * @author caojx
 * @version $Id: MovieController.java,v 1.0 2019-03-19 13:22 caojx
 * @date 2019-03-19 13:22
 */
@Slf4j
@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 本例使用了fallbackMethod 属性，指定了一个降级方法，如不指定，Hystrix会有一个默认的降级方案，那就是抛异常，哈哈哈。
     * 如何知道断路器打开还是关闭呢？还记得健康检查吗？只需访问应用的/actuator/health 端点，即可查看！断路器的状态
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        // ...电影微服务的业务...
        return user;
    }


    /**
     * 由代码可知，只需使用@HystrixCommand 注解，就可保护该API。这里的”保护“，其实带有三层含义——”超时机制“、”仓壁模式“、”断路器“！
     * 如果您不了解这些是什么，或者想要探寻其中原理，可详见：跟我学Spring Cloud（Finchley版）-12-微服务容错三板斧 http://www.itmuch.com/spring-cloud/finchley-12/
     *
     * 在实际项目中，很可能需要获得造成fallback的原因，Throwable throwable中可以捕获失败原因
     * @param id
     * @return
     */
    public User findByIdFallback(Long id, Throwable throwable) {
        log.error("进入回退方法", throwable);
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }
}