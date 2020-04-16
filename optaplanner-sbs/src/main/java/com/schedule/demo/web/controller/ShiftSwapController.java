package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@Controller
public class ShiftSwapController {

    @RequestMapping(value = "/shiftSwap")
    public String shiftSwap(){
        return "shiftSwap";
    }

    @RequestMapping(value = "/shiftSwapApproval")
    public String shiftSwapApproval(){
        return "shiftSwapApproval";
    }
}
