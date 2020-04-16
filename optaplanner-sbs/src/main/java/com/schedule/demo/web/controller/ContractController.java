package com.schedule.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Controller
public class ContractController {

    @RequestMapping(value = "/contractAdmin")
    public String contract(){
        return "contractAdmin";
    }

}
