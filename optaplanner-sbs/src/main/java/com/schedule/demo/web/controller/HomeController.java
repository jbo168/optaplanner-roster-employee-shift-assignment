package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 21-Mar-2020
 **/
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}
