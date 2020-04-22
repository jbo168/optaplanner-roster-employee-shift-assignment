package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 16-Apr-2020
 **/
@Controller
public class RosterController {
    @RequestMapping("/roster")
    public String home(){
        return "roster";
    }
}
