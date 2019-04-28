package caojx.learn.microservicesimpleconsumermoviefeignhystrixfallbackfactory.feign;

import caojx.learn.microservicesimpleconsumermoviefeignhystrixfallbackfactory.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

/**
 * 编写Feign Client，获得造成fallback的原因
 * Feign默认已经整合了Hystrix
 * @author caojx
 * @version $Id: UserFeignClient.java,v 1.0 2019-04-11 13:08 caojx
 * @date 2019-04-11 13:08
 */
@FeignClient(name = "microservice-provider-user", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}

/**
 * 获得造成fallback的原因
 */
@Slf4j
@Component
class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                log.error("进入回退逻辑", throwable);
                return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
            }
        };
    }
}