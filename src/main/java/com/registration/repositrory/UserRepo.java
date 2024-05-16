package com.registration.repositrory;

import com.registration.entity.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface UserRepo extends CrudRepository<User, Integer> {
     Optional<User> findById(Integer userId);
}
