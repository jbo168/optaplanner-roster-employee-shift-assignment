package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@Controller
public class HolidayRequestController {

    @RequestMapping(value = "/holidayRequest")
    public String holidayRequest(){
        return "holidayRequest";
    }

    @RequestMapping(value = "/holidayRequestApproval")
    public String holidayRequestApproval(){
        return "holidayRequestApproval";
    }
}
