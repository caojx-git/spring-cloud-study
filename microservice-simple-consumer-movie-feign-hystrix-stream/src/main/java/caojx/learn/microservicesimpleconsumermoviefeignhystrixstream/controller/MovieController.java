package caojx.learn.microservicesimpleconsumermoviefeignhystrixstream.controller;

import caojx.learn.microservicesimpleconsumermoviefeignhystrixstream.entity.User;
import caojx.learn.microservicesimpleconsumermoviefeignhystrixstream.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}