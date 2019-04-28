package caojx.learn.microservicesimplediscoveryeureka.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Cloud Finchley及更高版本，必须添加如下代码，部分关闭掉Spring Security 的CSRF保护功能，否则应用无法正常注册！
 *
 * @author caojx
 * @version $Id: WebSecurityConfig.java,v 1.0 2019-03-21 13:57 caojx
 * @date 2019-03-21 13:57
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}