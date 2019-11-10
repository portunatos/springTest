package com.jek;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class TestController {


    @GetMapping("/get/{name}")
    public User addUser(@PathVariable String name) {
        User user = new User(Integer.toUnsignedLong(1), name);
        return user;
    }
}
