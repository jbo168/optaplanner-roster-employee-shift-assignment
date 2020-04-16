package com.schedule.demo.web.controller;

import com.schedule.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Controller
public class SkillController {
    @Autowired
    SkillService skillService;

    @RequestMapping(value = "/skillAdmin")
    public String skill(){
        return "skillAdmin";
    }

}
