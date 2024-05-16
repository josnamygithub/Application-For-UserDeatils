package com.registration.controller;

import com.registration.entity.*;
import com.registration.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("{userId}")
    public Optional<User> getUserByUserId(@PathVariable Integer userId){
        return  userService.getByUserId(userId);
    }

}
