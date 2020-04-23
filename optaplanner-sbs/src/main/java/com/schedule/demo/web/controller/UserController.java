package com.schedule.demo.web.controller;

import com.schedule.demo.entity.User;
import com.schedule.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(User user) {
        return "login";
    }

    @PostMapping("/login")
    public String validateLogin(@ModelAttribute(name = "user") User user, Model model){
        String email = user.getUserEmail();
        String password = user.getUserPassword();

//        boolean isLoginValid = userService.validLogin(email, password);
        boolean isLoginValid = true;

        if(isLoginValid){
            return "redirect:/";
        }else{
            model.addAttribute("isLoginValid", "msg");
            return "login";
        }
    }

    @PostMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(@ModelAttribute User user, Model model){
        String email = user.getUserEmail();
        boolean isRegisterValid = userService.validRegister(user);

        if(userService.findByEmail(email) == null){
            if(isRegisterValid){
                userService.save(user);
                return "redirect: /";
            }
            model.addAttribute("isRegisterValid", "msg");
            return "register";
        }
        model.addAttribute("emailExists", "Email already exists");
        return "register";
    }
}
