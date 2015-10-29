package com.springguild.users.data.repository;

import com.springguild.users.data.entity.*;
import org.springframework.data.repository.*;

import java.util.*;

/**
 * Created by jamesliljenquist on 10/28/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByName(String name);
}
