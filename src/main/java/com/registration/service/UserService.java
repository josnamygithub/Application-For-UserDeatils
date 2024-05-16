package com.registration.service;

import com.registration.entity.*;

import java.util.*;

public interface UserService {

    <optional> Optional<User> getByUserId(Integer userId);
}
