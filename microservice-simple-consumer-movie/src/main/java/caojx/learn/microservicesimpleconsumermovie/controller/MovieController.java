package caojx.learn.microservicesimpleconsumermovie.controller;

import caojx.learn.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 电影控制器
 *
 * @author caojx
 * @version $Id: MovieController.java,v 1.0 2019-03-19 13:22 caojx
 * @date 2019-03-19 13:22
 */
@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        // ...电影微服务的业务...
        return user;
    }
}