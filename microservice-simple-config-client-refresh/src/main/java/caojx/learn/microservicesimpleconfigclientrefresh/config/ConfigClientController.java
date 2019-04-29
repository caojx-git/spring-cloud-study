package caojx.learn.microservicesimpleconfigclientrefresh.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类注释，描述
 *
 * @author caojx
 * @version $Id: ConfigClientController.java,v 1.0 2019-04-28 12:41 caojx
 * @date 2019-04-28 12:41
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}