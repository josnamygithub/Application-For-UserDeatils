package com.registration.service;

import com.registration.dto.*;
import com.registration.entity.*;
import com.registration.repositrory.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public Optional<userDto> getByUserId(Integer userId) {
        Optional<User> user = userRepo.findById(userId);
        // first option convert to user
        User userDetails = user.get();
        // second  entity convert to dto
        userDto userDto = new userDto();
        userDto.setUserId(userDetails.getUserId());
        userDto.setUserName(userDetails.getUsername());
        userDto.setPassword(userDetails.getPassword());
        userDto.setPhoneNo(userDetails.getPhoneNo());
        userDto.setCity(userDetails.getCity());
        return Optional.of(userDto);
     }


}


