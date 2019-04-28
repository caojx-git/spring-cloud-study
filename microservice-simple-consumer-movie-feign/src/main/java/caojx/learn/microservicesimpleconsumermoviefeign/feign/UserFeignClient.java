package caojx.learn.microservicesimpleconsumermoviefeign.feign;

import caojx.learn.microservicesimpleconsumermoviefeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
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
@FeignClient(name = "microservice-simple-provider-user")
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}