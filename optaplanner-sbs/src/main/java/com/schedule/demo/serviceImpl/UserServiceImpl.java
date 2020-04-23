package com.schedule.demo.serviceImpl;

import com.schedule.demo.entity.User;
import com.schedule.demo.repository.UserRepository;
import com.schedule.demo.security.SecurityConfig;
import com.schedule.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    SecurityConfig config;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User update(User user) {
        String passwordEncoded = config.passwordEncoder().encode(user.getPassword());
        String password = user.getPassword();

        if(config.passwordEncoder().matches(password,passwordEncoded) && user.getPassword().length() < 30) {
            user.setUserPassword(passwordEncoded);
            return userRepository.save(user);
        }
        else{
            return userRepository.save(user);
        }
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByUserEmail(email);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public boolean validLogin(String email, String password) {
        User user = userRepository.findByUserEmail(email);
        if((email.equals(user.getUserEmail()) && password.equals(user.getPassword()))) {
            return true;
        }

        return false;
    }

    @Override
    public boolean validRegister(User user) {
        boolean isValid = true;
        if (user.getUserFirstName() != null && user.getUserLastName() != null && user.getUserPhone() != null &&
                user.getUserEmail() != null && user.getPassword() != null &&
                user.getUserName() != null) {
            if (!(user.getUserEmail().matches("[A-Za-z0-9@._]*")) || !(user.getUserEmail().length() < 30)) {
                isValid = false;
            }
            else if (!(user.getUserPhone().length() < 11) || !(user.getUserPhone().matches("[0-9]{10}"))) {
                isValid = false;
            }
            else{
                isValid = true;
            }
        }
        return isValid;
    }

}
