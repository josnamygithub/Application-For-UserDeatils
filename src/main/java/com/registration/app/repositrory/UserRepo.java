package com.registration.app.repositrory;

import com.registration.app.entity.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface UserRepo extends CrudRepository<UserDetails, Integer> {
     Optional<UserDetails> findById(Integer userId);
     Optional<UserDetails> findByUserName(String userName);
     Optional<UserDetails> findByPasswordAndCity(String password , String city);
}
