package com.registration.app.service;

import com.registration.app.dto.*;
import com.registration.app.entity.*;

import java.util.*;

public interface UserService {

    Optional<userDto> getByUserId(Integer userId);
    String addUser(userDto userDto);
    UserDetails UpdateUser(userDto userDto);
    String DeleteUser(Integer UserId);

    Optional<userDto> getByUserName(String userName);


    Optional<userDto> getByPasswordAndCity(String password, String city);

}
