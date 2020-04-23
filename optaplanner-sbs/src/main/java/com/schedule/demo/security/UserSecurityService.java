package com.schedule.demo.security;

import com.schedule.demo.entity.User;
import com.schedule.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Service
public class UserSecurityService implements UserDetailsService {
    @Autowired
    UserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        Map<String, User> accountTypes = new HashMap<>();

        User user = userService.findByEmail(username);

        if(user == null){
            throw new UsernameNotFoundException(username);
        }

//        accountTypes.put(user.getAccountType().toString(), user);
        return user;
    }
}
