package caojx.learn.microservicesimpleconsumermoviefeignhystrix.feign;

import caojx.learn.microservicesimpleconsumermoviefeignhystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

/**
 * 编写Feign Client，提供Fallback
 * Feign默认已经整合了Hystrix
 *
 * @author caojx
 * @version $Id: UserFeignClient.java,v 1.0 2019-03-31 22:15 caojx
 * @date 2019-03-31 22:15
 */
@FeignClient(name = "microservice-simple-provider-user", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}

@Component
class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }
}