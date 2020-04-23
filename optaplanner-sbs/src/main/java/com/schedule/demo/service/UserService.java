package com.schedule.demo.service;

import com.schedule.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Component
public interface UserService {
    void save(User user);

    User update(User user);

    Optional<User> findById(long id);

    List<User> findAll();

    boolean validLogin(String email, String password);

    boolean validRegister(User user);

    User findByEmail(String email);

    void deleteById(long id);

}
