package caojx.learn.microservicesimpleproviderusersleuthzipkin.controller;


import caojx.learn.microservicesimpleproviderusersleuthzipkin.dao.UserRepository;
import caojx.learn.microservicesimpleproviderusersleuthzipkin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 用户controller
 *
 * @author caojx
 * @version $Id: UserController.java,v 1.0 2019-03-19 13:13 caojx
 * @date 2019-03-19 13:13
 */
@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return this.userRepository.findById(id);
    }
}