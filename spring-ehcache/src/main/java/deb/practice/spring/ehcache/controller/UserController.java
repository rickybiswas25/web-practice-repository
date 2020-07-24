package deb.practice.spring.ehcache.controller;

import deb.practice.spring.ehcache.model.User;
import deb.practice.spring.ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Deb
 * Date : 22/07/2020.
 */
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{name}")
    public User getName(@PathVariable String name) {
        return this.userService.findByName(name);
    }
}
