package com.therealdanvega.controller;

import com.therealdanvega.domain.User;
import com.therealdanvega.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public Iterable<User> list() {
        return userService.list();
    }

    @GetMapping("/avg")
    public int getAverageAge() {
        return userService.getAverageAge();
    }

    @GetMapping("/max/{name}")
    public int getMaxAge(@PathVariable String name) {
        return userService.getMaxAge(name);
    }

}
