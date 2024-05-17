package com.registration.app.controller;

import com.registration.app.dto.*;
import com.registration.app.entity.*;
import com.registration.app.service.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/{userId}")
    public ResponseEntity<userDto> getByUserId(@PathVariable Integer userId){
        System.out.println("userId"+userId);
        Optional<userDto> userData = userService.getByUserId(userId);
        if(userData.isPresent()){
            return  ResponseEntity.ok(userData.get());
        }else{
            return  ResponseEntity.notFound().build();
        }
    }
    @PostMapping
        public String addUser(@RequestBody userDto userDto){
            return  userService.addUser(userDto);
    }
    @PutMapping("/update")
    public UserDetails UpdateUser(@RequestBody userDto userDto){
        return userService.UpdateUser(userDto);
          }

     @DeleteMapping("/{UserId}")
    public  String Deleteuser(@PathVariable Integer  UserId){
        return  userService.DeleteUser(UserId);
     }

     @GetMapping("name/{userName}")
    public Optional<userDto> getByUserName(@PathVariable String userName){

         return userService.getByUserName(userName);
     }

     @GetMapping("/{password}/{city}")
    public Optional<userDto> getByPasswordAndCity(@PathVariable String password, @PathVariable String city){
        return userService.getByPasswordAndCity(password,city);
     }

    }

