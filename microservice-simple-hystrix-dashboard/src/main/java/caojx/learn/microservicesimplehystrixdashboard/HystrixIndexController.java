package caojx.learn.microservicesimplehystrixdashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 如果对http://localhost:8030/hystrix 地址中的hystrix 小尾巴不满意怎么办？
 * 还记得Spring MVC的服务器端跳转（forward）吗？只需添加类似如下的Controller，
 * 就可以使用http://localhost:8030/ 访问到Hystrix Dashboard首页了。
 *
 * @author caojx
 * @version $Id: HystrixIndexController.java,v 1.0 2019-04-14 17:28 caojx
 * @date 2019-04-14 17:28
 */
@Controller
public class HystrixIndexController {
    @GetMapping("")
    public String index() {
        return "forward:/hystrix";
    }
}