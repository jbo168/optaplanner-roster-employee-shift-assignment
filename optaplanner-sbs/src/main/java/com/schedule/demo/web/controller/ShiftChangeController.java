package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@Controller
public class ShiftChangeController {
    @RequestMapping(value = "/shiftChange")
    public String shiftChange(){
        return "shiftChange";
    }

    @RequestMapping(value = "/shiftChangeApproval")
    public String shiftChangeApproval(){
        return "shiftChangeApproval";
    }
}
