package deb.practice.spring.events.controller;

import deb.practice.spring.events.model.User;
import deb.practice.spring.events.model.Users;
import deb.practice.spring.events.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
@RestController
@RequestMapping("/event")
public class SpringEventController {

    private final UserService userService;

    @Autowired
    public SpringEventController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User remove(@PathVariable long id) {
        return this.userService.deleteUser(id);
    }
}
