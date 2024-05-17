package com.registration.app.service;

import com.registration.app.dto.*;
import com.registration.app.entity.*;
import com.registration.app.repositrory.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import java.util.*;

@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public Optional<userDto> getByUserId(Integer userId) {
        Optional<UserDetails> user = userRepo.findById(userId);
        // first option convert to user
        UserDetails userDetails = user.get();
        // second  entity convert to dto
        userDto userDto = new userDto();
        userDto.setUserId(userDetails.getUserId());
        userDto.setUserName(userDetails.getUserName());
        userDto.setPassword(userDetails.getPassword());
        userDto.setPhoneNo(userDetails.getPhoneNo());
        userDto.setCity(userDetails.getCity());
        return Optional.of(userDto);
     }
    @Transactional
    @Override
    public String addUser(userDto userDto) {
        UserDetails user = new UserDetails();
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setPhoneNo(userDto.getPhoneNo());
        user.setCity(userDto.getCity());
        userRepo.save(user);
        return "Success";
    }

    @Transactional
    @Override
    public UserDetails UpdateUser(userDto userDto) {
        Optional<UserDetails> userData = userRepo.findById(userDto.getUserId());
        UserDetails userdet = userData.get();
        userdet.setUserName(userDto.getUserName());
        userdet.setPhoneNo(userDto.getPhoneNo());
        userdet.setCity(userDto.getCity());
        userdet.setPassword(userdet.getPassword());
        return userdet;
    }

    @Transactional
    @Override
    public String DeleteUser(Integer UserId) {
        userRepo.deleteById(UserId);
        return "Succuess";
    }

    @Override
    public Optional<userDto> getByUserName(String userName) {
        Optional<UserDetails> userdata = userRepo.findByUserName(userName);
        UserDetails userdet = userdata.get();
        userDto userdto = new userDto();
//        userdto.setUserId(userdet.getUserId());
        userdto.setUserName(userdet.getUserName());
        userdto.setPassword(userdet.getPassword());
        userdto.setPhoneNo(userdet.getPhoneNo());
        userdto.setCity(userdet.getCity());

        return Optional.of(userdto);
    }

    @Override
    public Optional<userDto> getByPasswordAndCity(String password, String city) {
        Optional<UserDetails> userdata= userRepo.findByPasswordAndCity(password,city);
        UserDetails userdet = userdata.get();
        userDto userDto= new userDto();
        userDto.setUserId(userdet.getUserId());
        userDto.setUserName(userdet.getUserName());
        userDto.setPassword(userdet.getPassword());
        userDto.setCity(userdet.getCity());
        userDto.setPhoneNo(userdet.getPhoneNo());

        return Optional.of(userDto);
    }


}


