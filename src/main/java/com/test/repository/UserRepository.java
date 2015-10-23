package com.test.repository;

import com.test.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rodbate on 2015/10/22.
 */
@Configuration
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<User,Integer>{




}
